import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    void getValueBetweenZeroAndSix() {
        Die die = new Die();
        int[] dieValues = new int[50];
        for(int i = 0; i < dieValues.length; ++i){
            die.roll();
            System.out.println(die.getFaceValue());
            assertTrue(die.getFaceValue() >= 1 && die.getFaceValue() <= 6);
        }
    }

}