public class VisitorArea implements Visitor {
    private int area;
    @Override
    public void visitSquare(Square square) {
        area = square.getSide()*square.getSide();
        System.out.println("Area of square is: "+area);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        area = rectangle.getBase()*rectangle.getHeight();
        System.out.println("Area of rectangle is: "+area);
    }
}
