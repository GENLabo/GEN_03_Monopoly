import java.util.ArrayList;

public class Player {

    private ArrayList<Die> dice;
    private String name;
    Board board;
    Piece piece;


    public Player(String name, ArrayList<Die> dice, Board board){
        this.name = name;
        this.dice = dice;
        this.board = board;
        this.piece = new Piece(name + "-piece", board.getSquareByIndex(0));
    }

    public void takeTurn(){
        int totalDiceFaceValue = 0;
        // Roll the dice and get the totalValue
        for(int i = 0; i < dice.size(); ++i){
            dice.get(i).roll();
            totalDiceFaceValue += dice.get(i).getFaceValue();
        }

        // Fetch the new location related to the current one and the dice values and move into the new location
        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, totalDiceFaceValue);
        piece.setLocation(newLocation);

        System.out.println(name + " with piece \"" + piece.getName() + "\"" + " rolled " + totalDiceFaceValue + " and move from " + oldLocation.getName() + " to " + newLocation.getName());
    }

}
