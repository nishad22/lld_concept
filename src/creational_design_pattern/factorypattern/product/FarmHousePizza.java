package creational_design_pattern.factorypattern.product;

import creational_design_pattern.factorypattern.Pizza;

public class FarmHousePizza implements Pizza {

    @Override
    public void pizzaType() {
        System.out.println("you have ordered farm house pizza");
    }
}
