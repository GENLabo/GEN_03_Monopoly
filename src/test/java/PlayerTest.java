/*
  Authors: Robin Demarta, Loïc Dessaules, Vitor Vaz Afonso
  Date: 20.04.2020
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Board board = new Board();
    Cup cup = new Cup();
    Player toto;

    @BeforeEach
    public void initializePlayer(){
        toto = new Player("toto",cup,board);
    }

    @Test
    void getToJailFromGotoToJail(){
        toto.move(board.getSquareByIndex(30));
        assertEquals("Jail 10", toto.piece.getLocation().getName());
    }

    @Test
    void addCashToPlayer(){
        toto.addCash(200);
        assertEquals(toto.getNetWorth(),1700);
    }

    @Test
    void reduceCashToPlayer(){
        toto.reduceCash(200);
        assertEquals(toto.getNetWorth(),1300);
    }

}