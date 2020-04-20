/*
 * Authors : Loïc Dessaules, Vitor Vaz Afonso, Robin Demarta
 * Date : 20.04.2020
 * File : GoSquare.java
 */

public class GoSquare extends Square{

    private final static int cashToGive = 200;

    public GoSquare(String name, int index) {
        super(name, index);
    }

    /**
     * Gives to the player the starting amount of cash
     * @param player The Player
     */
    @Override
    void landedOn(Player player) {
        player.addCash(cashToGive);
    }
}
