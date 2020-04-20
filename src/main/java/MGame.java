/*
 * Authors : Loïc Dessaules, Vitor Vaz Afonso, Robin Demarta
 * Date : 20.04.2020
 * File : MGame.java
 */

import java.util.ArrayList;

public class MGame {

    private final int MIN_PLAYERS_NB = 2;
    private final int MAX_PLAYERS_NB = 8;
    private final int ROUNDS_NB = 20;

    private ArrayList<Player> players;
    private Cup diceCup;
    private Board board;


    /**
     * Public constructor, game initialisation
     */
    public MGame(int playerNb){
        if(playerNb < MIN_PLAYERS_NB || playerNb > MAX_PLAYERS_NB){
            throw new IndexOutOfBoundsException("Player number must be between 2 - 8");
        }
        board = new Board();
        // generate the dice
        this.diceCup = new Cup();

        generatePlayers(playerNb);
    }

    /**
     * Generate a random nb of players between [2,8]
     * with random name related to the PLAYERS_NAME ArrayList
     */
    private void generatePlayers(int playerNb){
        players = new ArrayList<>(playerNb);
        for(int i = 0; i < playerNb; ++i){
            players.add(new Player("Player" + (i+1), diceCup, board));
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
