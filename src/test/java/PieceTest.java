import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    void getLocation() {
        Board board = new Board();
        Piece piece = new Piece("Voiture", board.getSquareByIndex(5));
        assertNotNull(piece.getLocation());
    }

    @Test
    void setLocation() {
        Board board = new Board();
        Piece piece = new Piece("Voiture", board.getSquareByIndex(5));
        Square newLoc = board.getSquareByIndex(10);
        piece.setLocation(newLoc);

        assertSame(piece.getLocation(), newLoc);
    }
}