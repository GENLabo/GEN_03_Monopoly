import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

    @Test
    void landedOnIncomeTaxSquareWhenPlayerHasLessThan2000Dollars() {
        Board board = new Board();
        Cup cup = new Cup();
        Player toto = new Player("toto",cup,board);
        IncomeTaxSquare incomeTaxSquare = (IncomeTaxSquare) board.getSquareByIndex(4);
        incomeTaxSquare.landedOn(toto);
        assertEquals(1350,toto.getNetWorth());
    }

    @Test
    void landedOnIncomeTaxSquareWhenPlayerHasMoreOrExactly2000Dollars() {
        Board board = new Board();
        Cup cup = new Cup();
        Player toto = new Player("toto",cup,board);
        IncomeTaxSquare incomeTaxSquare = (IncomeTaxSquare) board.getSquareByIndex(4);
        toto.addCash(500);
        incomeTaxSquare.landedOn(toto);
        assertEquals(1800,toto.getNetWorth());
    }

}