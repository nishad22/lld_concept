package structural_design_pattern.decorator;

public class CoffeeDecorator implements Coffee{

    private Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratorCoffee = decoratorCoffee;
    }

    @Override
    public String getDescription() {
        return decoratorCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratorCoffee.getCost();
    }
}
