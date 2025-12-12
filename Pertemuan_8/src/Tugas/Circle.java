package Tugas;

public class Circle extends Shape {
    private float radius;
    private Point center;

    public Circle() {
        center = new Point();  // composition (Circle "owns" Point)
    }

    public float getRadius() { return radius; }
    public void setRadius(float radius) { this.radius = radius; }

    public void setCenter(Point center) { this.center = center; }

    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    public double circum() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {}

    @Override
    public void erase() {}

    @Override
    public void move() {}

    @Override
    public void resize() {}
}
