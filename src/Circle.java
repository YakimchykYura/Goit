import java.awt.*;
public class Circle extends Shape {
    int radius;
    public Circle(String name, Color color, int radius) {
        super(name, color);
        this.radius = radius;
    }
}
