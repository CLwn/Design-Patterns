public class Rectangle implements Figures {
    private String shape = "I'm a rectangle";
    private int base, height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getShape() {
        return shape;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor v) {
        v.visitRectangle(this);
    }
}
