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
