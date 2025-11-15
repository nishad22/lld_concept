package structural_design_pattern.decorator;

public class SizeCoffeeDecorator extends CoffeeDecorator {

    private String size;

    public SizeCoffeeDecorator(Coffee decoratorCoffee, String size) {
        super(decoratorCoffee);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getCost() {
        return super.getCost() + (size.equalsIgnoreCase("large") ? 1.5 : 0.0);
    }
}
