/*
  Authors: Robin Demarta, Loïc Dessaules, Vitor Vaz Afonso
  Date: 20.04.2020
 */

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @RepeatedTest(100)
    void totalValueMustBeBetween2And12Inclusive(){
        Cup cup = new Cup();
        assertTrue(cup.getTotal() >= 2 && cup.getTotal() <= 12);
    }

}