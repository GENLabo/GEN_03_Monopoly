import java.util.ArrayList;

public class Board {

    private ArrayList<Square> squares;

    public Board(){
        squares = new ArrayList<>(40);
        squares.add(new Square("Go"));
        for(int i = 1; i <=39; ++i){
            squares.add(new Square("Square"+i));
        }
    }

    public Square getSquare(int oldLoc, int fvTot){
        if (oldLoc < 0 || oldLoc > 39)
            throw new IndexOutOfBoundsException("oldLoc must be between 0 and 39 inclusive");
        if (fvTot < 2 || fvTot > 12)
            throw new IndexOutOfBoundsException("fvTot must be between 2 and 12 inclusive");

        return squares.get((oldLoc + fvTot) % 40);
    }

}
