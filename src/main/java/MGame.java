import java.lang.reflect.Array;
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

    private ArrayList<Player> players;
    private ArrayList<Die> dice;
    private Random rand = new Random();

    /**
     * Public constructor, game initialisation
     * Generate a random number of players
     * Generate 2 dice
     */
    public MGame(){
        // First, generate the dice
        dice = new ArrayList<>(DICE_NB);
        dice.add(new Die());
        dice.add(new Die());
        // Secondly, generate the players
        generatePlayers();
    }

    /**
     * Generate a random nb of players between [2,8]
     * with random name related to the PLAYERS_NAME ArrayList
     */
    private void generatePlayers(){
        int randPlayersNb = rand.nextInt((MAX_PLAYERS_NB - MIN_PLAYERS_NB) + 1) + MIN_PLAYERS_NB;
        players = new ArrayList<>();
        for(int i = 0; i < randPlayersNb; ++i){
            // Pick a random name and create player
            int randName = rand.nextInt(MAX_PLAYERS_NB );
            players.add(new Player(PLAYERS_NAMES.get(randName), dice));
        }
    }

    /**
     * Game loop to run the game
     */
    public void playGame(){
        for(int i = 0; i < ROUNDS_NB; ++i){
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

    /**
     * Dice getter
     * @return The Dice ArrayList
     */
    public ArrayList<Die> getDice() {
        return dice;
    }
}
