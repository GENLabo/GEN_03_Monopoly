/*
  Authors: Robin Demarta, Loïc Dessaules, Vitor Vaz Afonso
  Date: 20.04.2020
 */

import java.util.ArrayList;

public class Board {

    // Squares' indexes go from 0 to totalSquareNumber-1, where 0 is the GoSquare
    private ArrayList<Square> squares;

    // If the following indexes overlap, priority is set as defined in the switch-case structure in Board()
    private final int totalSquareNumber = 40;
    private final int GOTO_JAIL_INDEX = 30;
    private final int JAIL_INDEX = 10;
    private final int INCOMETAX_INDEX = 4;

    /**
     * Generates all types of squares.
     */
    public Board(){
        squares = new ArrayList<>(totalSquareNumber);
        GoToJailSquare goToJailSquare = null;

        // Create starting position
        squares.add(0, new GoSquare("Start", 0));

        // Generate rest of the other squares
        Square newSquare;
        for(int i = 1; i < totalSquareNumber; ++i) { // Start at 1 because start has already been set
            // Squares' position in container match their index, so we avoid confusion

            switch(i) {
                case INCOMETAX_INDEX: // IncomeTaxSquare
                    newSquare = new IncomeTaxSquare("IncomeTaxSquare", i);
                    break;
                case GOTO_JAIL_INDEX: // GoToJailSquare
                    goToJailSquare = new GoToJailSquare("GoToJailSquare", i);
                    newSquare = goToJailSquare;
                    break;
                default: // Regular squares (one of which will be the jail)
                    newSquare = new RegularSquare(i == JAIL_INDEX ? "Jail" : "RegularSquare", i);
                    break;
            }
            squares.add(i, newSquare);
        }

        // Set which square is the jail
        if(goToJailSquare != null)
            goToJailSquare.setJail(squares.get(JAIL_INDEX));
    }

    /**
     * Retrieve the square depending on the dice roll.
     * @param oldLoc player's previous location
     * @param fvTot value of the rolled dice
     * @return
     */
    public Square getSquare(Square oldLoc, int fvTot){
        if (oldLoc.getIndex() < 0 || oldLoc.getIndex()  > 39)
            throw new IndexOutOfBoundsException("oldLoc must be between 0 and 39 inclusive");
        if (fvTot < 2 || fvTot > 12)
            throw new IndexOutOfBoundsException("fvTot must be between 2 and 12 inclusive");

        return squares.get((oldLoc.getIndex()  + fvTot) % 40);
    }

    /**
     * Return the first Square that is the "Go" Square
     * @return The "Go" Square
     */
    public Square getSquareByIndex(int index){
        if(index < 0 || index > 39){
            throw new IndexOutOfBoundsException("oldLoc must be between 0 and 39 inclusive");
        }

        return squares.get(index);
    }
}
