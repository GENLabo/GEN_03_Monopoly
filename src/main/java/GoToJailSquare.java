public class GoToJailSquare extends Square {

    private Square jail;

    public GoToJailSquare(String name, int index) {
        super(name, index);
    }

    public void setJail(Square jail) {
        this.jail = jail;
    }

    /**
     * Sends player straight to the jail.
     * @param player
     */
    @Override
    void landedOn(Player player) {
        if(jail == null)
            throw new RuntimeException("Cannot send player to jail: JailSquare has not been set.");
        player.move(jail);
    }
}
