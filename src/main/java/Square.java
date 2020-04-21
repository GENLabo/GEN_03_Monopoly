/*
 * Authors : Loïc Dessaules, Vitor Vaz Afonso, Robin Demarta
 * Date : 20.04.2020
 * File : Square.java
 */

public abstract class Square {

    private String name;
    private int index;

    /**
     * Constructs base of Square object
     * @param name
     * @param index
     */
    public Square(String name, int index) {
        this.name = name + " " + index;
        this.index = index;
    }

    /**
     * Get the name
     * @return The square name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the index
     * @return The square index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Performs specific action when player lands on the square
     * @param player
     */
    abstract void landedOn(Player player);
}
