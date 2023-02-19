import java.awt.*;
public abstract class Shape {
    protected String name;
    protected Color color;
    protected int[] coordinates;

    public void printName() {
        System.out.println(name);
    }

    public Shape(String name, Color color, int[] coordinates) {
        this.name = name;
        this.color = color;
        this.coordinates = coordinates;
    }
}



