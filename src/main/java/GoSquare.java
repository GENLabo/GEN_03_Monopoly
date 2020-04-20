/*
  Authors: Robin Demarta, Loïc Dessaules, Vitor Vaz Afonso
  Date: 20.04.2020
 */

public class GoSquare extends Square{

    private final static int cashToGive = 200;

    public GoSquare(String name, int index) {
        super(name, index);
    }

    /**
     * Gives to the player the starting amount of cash
     * @param player
     */
    @Override
    void landedOn(Player player) {
        player.addCash(cashToGive);
    }
}
