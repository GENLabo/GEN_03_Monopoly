/*
 * Authors : Loïc Dessaules, Vitor Vaz Afonso, Robin Demarta
 * Date : 20.04.2020
 * File : Piece.java
 */

public class Piece {
    private String name;
    private Square location;

    public Piece(String name, Square location) {
        this.name = name;
        this.location = location;
    }

    /**
     * Get the location
     * @return The current location
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Get the name
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the location
     * @param newLoc The new location
     */
    public void setLocation(Square newLoc) {
        location = newLoc;
    }
}
