package creational_design_pattern.factorypattern.pizzafactory;

import creational_design_pattern.factorypattern.PizzaCreator;
import creational_design_pattern.factorypattern.product.FarmHousePizza;
import creational_design_pattern.factorypattern.Pizza;

public class FarmHousePizzaCreatorFactory implements PizzaCreator {

    @Override
    public Pizza createPizza() {
        return new FarmHousePizza();
    }
}
