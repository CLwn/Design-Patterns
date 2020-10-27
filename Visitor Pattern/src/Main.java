public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4,5);

        Visitor area = new VisitorArea();
        Visitor shape = new VisitorShape();

        shape.visitRectangle(rectangle);
        area.visitRectangle(rectangle);

        shape.visitSquare(square);
        area.visitSquare(square);

    }
}
