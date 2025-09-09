package Prototype.Shape;

public class ShapePrototye {
    private Shape shape;

    public ShapePrototye(Shape shape) {
        this.shape = shape;
    }

    public Shape createShape() {
        return shape.clone();
    }
}
