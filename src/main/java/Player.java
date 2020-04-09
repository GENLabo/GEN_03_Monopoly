import java.util.ArrayList;

public class Player {

    private ArrayList<Die> dice;
    private String name;

    // todo : Board board ...
    // todo : Piece = ew Piece (thisname + "piece")

    public Player(String name, ArrayList<Die> dice){
        this.name = name;
        this.dice = dice;
        // todo : Set board
        // todo : Set piece
    }

    public void takeTurn(){
        int totalDiceFaceValue = 0;
        // Roll the dice and get the totalValue
        for(int i = 0; i < dice.size(); ++i){
            dice.get(i).roll();
            totalDiceFaceValue += dice.get(i).getFaceValue();
        }


    }

}
