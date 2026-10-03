package bridge;

import bridge.abstraction.Circle;
import bridge.abstraction.Shape;
import bridge.abstraction.Square;
import bridge.implementor.RasterRenderer;
import bridge.implementor.Renderer;
import bridge.implementor.VectorRenderer;


public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circle = new Circle(vector, 10, 10, 5);
        Shape square = new Square(vector, 0, 0, 4);

        System.out.println("--- Vector ---");
        circle.draw();
        square.draw();

        System.out.println("--- Switch to Raster at runtime ---");
        circle.setRenderer(raster);
        square.setRenderer(raster);
        circle.draw();
        square.draw();

        System.out.println("--- Resize x2 (abstraction logic, renderer unchanged) ---");
        circle.resize(2);
        square.resize(2);
        circle.draw();
        square.draw();
    }
}
