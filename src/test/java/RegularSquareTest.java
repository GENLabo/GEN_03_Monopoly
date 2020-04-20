import org.junit.jupiter.api.AfterEach;
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