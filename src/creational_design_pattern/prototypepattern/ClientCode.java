package creational_design_pattern.prototypepattern;

public class ClientCode {

    public static void main(String[] args) {

        Shape rectangle = new RectanglePrototype("rectangle");
        Shape circle = new CirclePrototype("circle");

        Shape rectanglePrototype = rectangle.shape();
        rectanglePrototype.setName("square");

        Shape circlePrototype = circle.shape();
        circlePrototype.setName("big circle");


        System.out.println(rectangle.getName());
        System.out.println(circle.getName());
        System.out.println(rectanglePrototype.getName());
        System.out.println(circlePrototype.getName());
    }
}
