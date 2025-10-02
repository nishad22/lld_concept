package creational_design_pattern.factorypattern;

import creational_design_pattern.factorypattern.pizzafactory.FarmHousePizzaCreatorFactory;
import creational_design_pattern.factorypattern.pizzafactory.MargaritaPizzaCreatorFactory;

public class ClientCode {

    public static void main(String[] args) {

        PizzaCreator margaritaPizza = new MargaritaPizzaCreatorFactory();
        Pizza pizza = margaritaPizza.createPizza();
        pizza.pizzaType();

        PizzaCreator farmHousePizzaCreatorFactory = new FarmHousePizzaCreatorFactory();
        Pizza farmhousePizza = farmHousePizzaCreatorFactory.createPizza();
        farmhousePizza.pizzaType();
    }
}
