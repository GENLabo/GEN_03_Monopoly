public class Piece {
    private String name;
    private Square location;

    public Piece(String name, Square location) {
        this.name = name;
        this.location = location;
    }

    /**
     * Get the location
     * @return
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Get the name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set the location
     * @param newLoc
     */
    public void setLocation(Square newLoc) {
        location = newLoc;
    }
}
