public abstract class Square {

    private String name;
    private int index;

    /**
     * Constructs base of Square object
     * @param name
     * @param index
     */
    public Square(String name, int index) {
        this.name = name;
        this.index = index;
    }

    /**
     * Get the name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Get the index
     * @return
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
