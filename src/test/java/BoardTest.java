import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BoardTest {

    @Test
    void get6SquareAhead(){
        Board board = new Board();
        Square square10 = board.getSquare(4,6);
        assertEquals("Square10", square10.getName());
    }

    @Test
    void get8SquareAheadAndDoACycle(){
        Board board = new Board();
        Square square4 = board.getSquare(36,8);
        assertEquals("Square4", square4.getName());
    }

    @Test
    void GetIndexOutOfBoundsExceptionFromOldLoc(){
        Board board = new Board();
        assertThrows(IndexOutOfBoundsException.class, () -> { board.getSquare(2,13);});
    }

    @Test
    void GetOIndexOutOfBoundsExceptionFromFvTot(){
        Board board = new Board();
        assertThrows(IndexOutOfBoundsException.class, () -> { board.getSquare(40,12);});
    }
}