/*
 * Authors : Loïc Dessaules, Vitor Vaz Afonso, Robin Demarta
 * Date : 20.04.2020
 * File : Main.java
 */

public class Main {

    public static void main(String[] args){

        // Need the player number [2-8] as argument to play
        if(args.length != 1){
            throw new RuntimeException("The application must have one argument as the number of player : [2-8]");
        }

        try{
            int playerNumber = Integer.parseInt(args[0]);
            MGame monopoly = new MGame(playerNumber);
            monopoly.playGame();
        }catch(NumberFormatException e){
            System.out.println("The number of player must be a number between : [2-8]");
        }

    }

}
