package Tugas;

import java.util.ArrayList;

public class Window {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void open() {}

    public void close() {}

    public void move() {}

    public void display() {}

    public void handleEvent(Event event) {}

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
}
