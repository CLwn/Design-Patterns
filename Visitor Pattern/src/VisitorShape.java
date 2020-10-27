public class VisitorShape implements Visitor {

    @Override
    public void visitSquare(Square square) {
        System.out.println(square.getShape());
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println(rectangle.getShape());
    }
}
