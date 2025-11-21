package structural_design_pattern.facade;

public class Client {

    public static void main(String[] args) {

        ShoppingFacade shoppingFacade = new ShoppingFacade();
        shoppingFacade.purchaseProduct();
    }
}
