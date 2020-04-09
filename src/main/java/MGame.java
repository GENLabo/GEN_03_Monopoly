import java.util.ArrayList;
import java.util.Random;

public class MGame {

    final int MIN_PLAYERS_NB = 2;
    final int MAX_PLAYERS_NB = 8;
    final int DICE_NB = 2;
    final int ROUNDS_NB = 20;

    ArrayList<Player> players;
    ArrayList<Die> dice;
    Random rand = new Random();

    /**
     * Public constructor, game initialisation
     * Generate a random number of players between [2,8]
     * Generate 2 dice
     */
    public MGame(){
        // Generate a random nb of players
        int randPlayersNb = rand.nextInt((MAX_PLAYERS_NB - MIN_PLAYERS_NB) + 1) + MIN_PLAYERS_NB;
        System.out.println(randPlayersNb);
        players = new ArrayList<>(randPlayersNb);
        dice = new ArrayList<>(DICE_NB);
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

    }

    /**
     * Dice getter
     * @return The Dice ArrayList
     */
    public ArrayList<Die> getDice() {
        return dice;
    }
}
