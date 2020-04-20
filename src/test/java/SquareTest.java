import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getNameNotNull() {
        Board board = new Board();
        Square square = board.getSquareByIndex(5);
        assertNotNull(square.getName());
    }

}