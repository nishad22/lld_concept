package structural_design_pattern.decorator;

public class Client {

    public static void main(String[] args) {

        Coffee largeCoffee = new SizeCoffeeDecorator(new SimpleCoffee(),"large");

        System.out.println(largeCoffee.getDescription());
        System.out.println(largeCoffee.getCost());
    }
}
