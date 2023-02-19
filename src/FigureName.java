import java.awt.*;
public class FigureName {
    Shape shape = new Shape("Quad", Color.GREEN, new int[]{12, 15, 45, 26, 45, 58, 44, 12}) {

        @Override
        public void printName() {
            System.out.println(name);
        }
    };
}