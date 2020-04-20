/*
 * Authors : Loïc Dessaules, Vitor Vaz Afonso, Robin Demarta
 * Date : 20.04.2020
 * File : Player.java
 */

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

        System.out.println(name + " (piece \"" + piece.getName() + "\") has " + getNetWorth() + " cash and rolled " + totalDiceFaceValue);

        // Fetch the new location related to the current one and the dice values and move into the new location
        move(board.getSquare(piece.getLocation(), totalDiceFaceValue));

        System.out.println(); // Line return
    }

    /**
     * Sends player to a new location and display the "travel".
     * @param newLocation
     */
    public void move(Square newLocation) {
        Square oldLocation = piece.getLocation();
        piece.setLocation(newLocation);

        System.out.println(name + " moved from " + oldLocation.getName() + " to " + newLocation.getName());
        newLocation.landedOn(this);
    }

    /**
     * Add cash to the player
     * @param amount
     */
    public void addCash(int amount) {
        if(amount < 0)
            throw new RuntimeException("Cannot add negative amount of cash to player.");
        this.cash += amount;
        System.out.println(name + " received " + amount);
    }

    /**
     * Get the player's cash amount
     * @return The player current cash amount
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
        System.out.println(name + " paid " + amount);
    }

}
