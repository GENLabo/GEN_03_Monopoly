import java.util.ArrayList;

public class Cup {

    private ArrayList<Die> dice;

    /**
     * Constructor, we can pass the nb of dice we want in the cup
     * @param nbDice Number of dice we want in the cup
     */
    public Cup(int nbDice){
        // Create all dice we need
        this.dice = new ArrayList<>(nbDice);
        for(int i = 0; i < nbDice; ++i){
            this.dice.add(new Die());
        }
    }

    /**
     * Roll all dice we have to update their current faceValue
     * A die value is between [1,6]
     */
    public void roll(){
        for(Die d : dice){
            d.roll();
        }
    }

    /**
     * Return the total of face value for each Die we have
     * @return The total face value
     */
    public int getTotal(){
        int totFaceValue = 0;
        for(Die d : dice){
            totFaceValue += d.getFaceValue();
        }

        return totFaceValue;
    }

}
