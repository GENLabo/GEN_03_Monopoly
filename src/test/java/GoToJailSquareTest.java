import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    @Test
    void landedOnGoToJailSquare() {
        Board board = new Board();
        Cup cup = new Cup(2);
        Player toto = new Player("toto",cup,board);
        GoToJailSquare goToJailSquare = (GoToJailSquare) board.getSquareByIndex(30);
        goToJailSquare.landedOn(toto);
        assertEquals("Jail 10", toto.piece.getLocation().getName());
    }
}