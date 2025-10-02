package creational_design_pattern.simplefactory;

public class ClientShape {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShapeFactory("circle");
        circle.draw();
        //it should not be used if factory returns the different object then it will return class cast exception
        Circle circle1 = (Circle) shapeFactory.createShapeFactory("circle");
        circle1.draw();
    }
}
