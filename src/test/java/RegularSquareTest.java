/*
  Authors: Robin Demarta, Loïc Dessaules, Vitor Vaz Afonso
  Date: 20.04.2020
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularSquareTest {

    @Test
    void landedOnRegularSquare() {
    Board board = new Board();
    Cup cup = new Cup();
    Player toto = new Player("toto",cup,board);
    RegularSquare regularSquare = (RegularSquare) board.getSquareByIndex(1);
    assertAll(()->regularSquare.landedOn(toto));
    }
}