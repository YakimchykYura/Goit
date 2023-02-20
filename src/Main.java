import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Quad quad = new Quad("Quad", Color.blue, new int[]{12, 56, 45, 59, 37, 15, 89, 54});
        FigureName nameShape = new FigureName(quad);

        Circle circle = new Circle("Circle", Color.red, 32);
        nameShape = new FigureName(circle);

        Triangle triangle = new Triangle("Triangle", Color.pink, new int[] {12, 65, 59, 34, 57, 89});
        nameShape = new FigureName(triangle);

        Pentagon pentagon = new Pentagon("Pentagon", Color.black, new int[] {98, 78, 65, 12, 35, 45, 45, 25, 35, 47});
        nameShape = new FigureName(pentagon);

        Hexagon hexagon = new Hexagon("Hexagon", Color.green, new int[] {32, 45, 99, 24, 14, 36, 45, 65, 69, 14, 36, 55});
        nameShape = new FigureName(hexagon);
    }
}