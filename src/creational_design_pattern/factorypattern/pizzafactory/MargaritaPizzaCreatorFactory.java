package creational_design_pattern.factorypattern.pizzafactory;

import creational_design_pattern.factorypattern.PizzaCreator;
import creational_design_pattern.factorypattern.product.MargaritaPizza;
import creational_design_pattern.factorypattern.Pizza;

public class MargaritaPizzaCreatorFactory implements PizzaCreator {
    @Override
    public Pizza createPizza() {
        return new MargaritaPizza();
    }
}
