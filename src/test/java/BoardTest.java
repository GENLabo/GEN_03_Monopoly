import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BoardTest {

    @Test
    void get6SquareAhead(){
        Board board = new Board();
        Square square10 = board.getSquare(board.getSquareByIndex(4),6);
        assertEquals("Square 10", square10.getName());
    }

    @Test
    void get8SquareAheadAndDoACycle(){
        Board board = new Board();
        Square square4 = board.getSquare(board.getSquareByIndex(36),8);
        assertEquals("Square 4", square4.getName());
    }

    @Test
    void GetIndexOutOfBoundsExceptionFromOldLoc(){
        Board board = new Board();
        assertThrows(IndexOutOfBoundsException.class, () -> { board.getSquare(board.getSquareByIndex(2),13);});
    }

    @Test
    void GetOIndexOutOfBoundsExceptionFromFvTot(){
        Board board = new Board();
        assertThrows(IndexOutOfBoundsException.class, () -> { board.getSquare(board.getSquareByIndex(40),12);});
    }

}