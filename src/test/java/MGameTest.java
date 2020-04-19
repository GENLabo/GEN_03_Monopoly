import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {

    @ParameterizedTest
    @ValueSource(ints = {0,1,9})
    void testInvalidNbOfPlayers(int playerNumber){
        assertThrows(IndexOutOfBoundsException.class, () -> {new MGame(playerNumber);});
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,4,5,6,7,8})
    void testValidNbOfPlayers(int playerNumber){
        assertAll(() -> new MGame(playerNumber));
    }

}