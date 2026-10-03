package bridge.implementor;


public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double x, double y, double radius) {
        System.out.printf("[Raster] filling ~%d pixels of a circle at (%.0f, %.0f)%n",
                (int) (Math.PI * radius * radius), x, y);
    }

    @Override
    public void renderSquare(double x, double y, double side) {
        System.out.printf("[Raster] filling %d pixels of a square at (%.0f, %.0f)%n",
                (int) (side * side), x, y);
    }
}
