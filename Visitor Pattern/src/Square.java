public class Square implements Figures {
    private String shape = "I'm a square";
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public String getShape() {
        return shape;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void accept(Visitor v) {
        v.visitSquare(this);
    }
}
