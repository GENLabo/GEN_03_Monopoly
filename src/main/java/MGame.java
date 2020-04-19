import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MGame {

    private final ArrayList<String> PLAYERS_NAMES = new ArrayList<String>(
            Arrays.asList("Loïc", "Robin", "Vitor", "Charles", "Lucie", "Luc", "Alex", "Luna")
    );

    private final int MIN_PLAYERS_NB = 2;
    private final int MAX_PLAYERS_NB = 8;
    private final int DICE_NB = 2;
    private final int ROUNDS_NB = 20;

    private Random rand = new Random();
    private ArrayList<Player> players;
    private ArrayList<Die> dice;
    private Board board;


    /**
     * Public constructor, game initialisation
     * Generate a random number of players
     * Generate 2 dice
     */
    public MGame(int playerNb){
        if(playerNb < MIN_PLAYERS_NB || playerNb > MAX_PLAYERS_NB){
            throw new IndexOutOfBoundsException("Player number must be between 2 - 8");
        }
        board = new Board();
        // generate the dice
        dice = new ArrayList<>(DICE_NB);
        dice.add(new Die());
        dice.add(new Die());

        generatePlayers(playerNb);
    }

    /**
     * Generate a random nb of players between [2,8]
     * with random name related to the PLAYERS_NAME ArrayList
     */
    private void generatePlayers(int playerNb){
        players = new ArrayList<>(playerNb);
        for(int i = 0; i < playerNb; ++i){
            players.add(new Player("Player" + (i+1), dice, board));
        }
    }

    /**
     * Game loop to run the game
     */
    public void playGame(){
        for(int i = 0; i < ROUNDS_NB; ++i){
            System.out.println("\n--------- Round " + (i+1) + "/" + ROUNDS_NB + " ---------") ;
            playRound();
        }
    }

    /**
     * Play a game round by asking each player to play their turn
     */
    private void playRound(){
        for(Player p : players){
            p.takeTurn();
        }
    }
}
