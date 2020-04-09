import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    void getLocation() {
        Piece piece = new Piece("Voiture", new Square("5"));
        assertNotNull(piece.getLocation());
    }

    @Test
    void setLocation() {
        Piece piece = new Piece("Voiture", new Square("5"));
        Square newLoc = new Square("10");
        piece.setLocation(newLoc);

        assertSame(piece.getLocation(), newLoc);
    }
}