import java.util.Random;

class Die {

    private static final int MAX_VALUE = 6;
    private static Random random;
    private int faceValue;

    public Die(){
        random = new Random();
        // Directly Roll one time to initiate the Die
        roll();
    }

    /**
     * Roll the die to update the current faceValue
     * A die value is between [1,6]
     */
    public void roll(){
        // Get a random value between [0, 5[ and add + 1 to have between [1, 6]
        faceValue = random.nextInt(MAX_VALUE) + 1;
    }

    /**
     * Return the current face value
     * @return the current face value
     */
    public int getFaceValue(){
        return faceValue;
    }

}
