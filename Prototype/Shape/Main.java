package Prototype.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("red");
        ShapePrototye shape = new ShapePrototye(circle);
        Shape redCircle = shape.createShape();
        redCircle.draw();
    }
}
