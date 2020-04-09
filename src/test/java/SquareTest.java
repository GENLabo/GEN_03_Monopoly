import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getName() {
        Square square = new Square("5");
        assertNotNull(square.getName());
    }
}