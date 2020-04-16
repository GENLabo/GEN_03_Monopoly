public class RegularSquare extends Square {
    public RegularSquare(String name, int index) {
        super(name, index);
    }

    /**
     * Does nothing for it is a regular square
     * @param player not used
     */
    @Override
    void landedOn(Player player) {
        // Perform the operation of doing nothing
    }
}
