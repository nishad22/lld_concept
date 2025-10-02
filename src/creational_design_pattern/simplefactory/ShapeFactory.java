package creational_design_pattern.simplefactory;

public class ShapeFactory {

    public Shape createShapeFactory(String shapeType) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }
        return null;
    }
}
