import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @RepeatedTest(100)
    void totalValueMustBeBetween2And12Inclusive(){
        Cup cup = new Cup();
        cup.roll();
        assertTrue(cup.getTotal() >= 2 && cup.getTotal() <= 12);
    }

}