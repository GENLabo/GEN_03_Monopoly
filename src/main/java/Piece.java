public class Piece {
    private String name;
    private Square location;

    public Piece(String name, Square location) {
        this.name = name;
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setLocation(Square newLoc) {
        location = newLoc;
    }
}
