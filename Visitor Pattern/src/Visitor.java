/**
 * Cada visitante es un tipo de proceso.
 * En este caso tendremos las diferentes operaciones que podemos aplicar
 * en una figura.
 */
public interface Visitor {

    void visitSquare(Square square);
    void visitRectangle(Rectangle rectangle);
}
