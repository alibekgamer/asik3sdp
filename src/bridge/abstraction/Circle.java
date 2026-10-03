package bridge.abstraction;

import bridge.implementor.Renderer;


public class Circle extends Shape {
    private final double x;
    private final double y;
    private double radius;

    public Circle(Renderer renderer, double x, double y, double radius) {
        super(renderer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(x, y, radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
