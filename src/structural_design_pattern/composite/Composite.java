package structural_design_pattern.composite;

import java.util.ArrayList;

// composite --> consisting of different parts or materials
public class Composite implements Component{

    private String name;
    ArrayList<Component> components;

    public Composite(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public void showPrice() {
        for (Component component : components) {
            component.name();
            component.showPrice();
        }
    }

    @Override
    public void name() {
        System.out.println("");
    }

    public void add(Component subComponent) {
        components.add(subComponent);
    }

}
