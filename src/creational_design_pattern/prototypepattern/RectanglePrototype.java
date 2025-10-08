package creational_design_pattern.prototypepattern;

public class RectanglePrototype implements Shape {

    private String name;

    public RectanglePrototype(String name) {
        this.name = name;
    }

    @Override
    public Shape shape() {
        return new RectanglePrototype(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
