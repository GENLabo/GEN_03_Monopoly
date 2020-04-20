/*
  Authors: Robin Demarta, Loïc Dessaules, Vitor Vaz Afonso
  Date: 20.04.2020
 */

public class IncomeTaxSquare extends Square {

    private final static int maxTax = 200;

    public IncomeTaxSquare(String name, int index) {
        super(name, index);
    }

    /**
     * Makes the player pay the tax.
     * The amount of the tax is 10% of player's net worth or maxTax at maximum.
     * @param player
     */
    @Override
    void landedOn(Player player) {
        player.reduceCash(Math.min(maxTax, (int)(0.1 * player.getNetWorth())));
    }
}
