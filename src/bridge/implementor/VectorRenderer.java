package bridge.implementor;


public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double x, double y, double radius) {
        System.out.printf("[Vector] <circle cx=%.1f cy=%.1f r=%.1f/>%n", x, y, radius);
    }

    @Override
    public void renderSquare(double x, double y, double side) {
        System.out.printf("[Vector] <rect x=%.1f y=%.1f width=%.1f height=%.1f/>%n", x, y, side, side);
    }
}
