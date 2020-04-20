/*
  Authors: Robin Demarta, Loïc Dessaules, Vitor Vaz Afonso
  Date: 20.04.2020
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {

    @Test
    void landedOnGoSquare() {
        Board board = new Board();
        Cup cup = new Cup();
        Player toto = new Player("toto",cup,board);
        GoSquare goSquare = (GoSquare) board.getSquareByIndex(0);
        goSquare.landedOn(toto);
        assertEquals(1700, toto.getNetWorth());
    }

}