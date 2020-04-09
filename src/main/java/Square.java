public  class Square {

    private String name;
    private static int count;
    private int index;

    public Square(String name) {
        this.name = name;
        index = count++;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
