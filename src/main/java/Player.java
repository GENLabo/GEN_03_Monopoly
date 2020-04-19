import java.util.ArrayList;

public class Player {

    private final static int startingCash = 1500;

    private Cup diceCup;
    private String name;
    Board board;
    Piece piece;
    int cash;

    public Player(String name, Cup diceCup, Board board){
        this.name = name;
        this.diceCup = diceCup;
        this.board = board;
        this.piece = new Piece(name + "-piece", board.getSquareByIndex(0));
        this.cash = startingCash;
    }

    /**
     * The player rolls the dice and moves to a new location
     */
    public void takeTurn(){
        diceCup.roll();
        int totalDiceFaceValue = diceCup.getTotal();

        // Fetch the new location related to the current one and the dice values and move into the new location
        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, totalDiceFaceValue);
        piece.setLocation(newLocation);

        System.out.println(name + " with piece \"" + piece.getName() + "\"" + " rolled " + totalDiceFaceValue + " and move from " + oldLocation.getName() + " to " + newLocation.getName());
    }

    /**
     * Add cash to the player
     * @param amount
     */
    public void addCash(int amount) {
        if(amount < 0)
            throw new RuntimeException("Cannot add negative amount of cash to player.");
        this.cash += amount;
    }

    /**
     * Get the player's cash amount
     * @return
     */
    public int getNetWorth() {
        return cash;
    }

    /**
     * Reduces the player's cash amount
     * @param amount
     */
    public void reduceCash(int amount) {
        if(amount < 0)
            throw new RuntimeException("Cannot reduce negative amount of cash.");
        this.cash -= amount;
    }



}
