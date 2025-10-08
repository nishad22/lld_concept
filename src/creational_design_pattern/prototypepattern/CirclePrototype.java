package creational_design_pattern.prototypepattern;

public class CirclePrototype implements Shape{

    private String name;

    public CirclePrototype(String name) {
        this.name = name;
    }

    @Override
    public Shape shape() {
        return new CirclePrototype(this.name);
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
