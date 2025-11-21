package structural_design_pattern.facade;

public class ShoppingFacade {

    private Inventory inventory;
    private Order order;
    private PaymentSystem paymentSystem;

    public ShoppingFacade() {
        this.inventory = new Inventory();
        this.order = new Order();
        this.paymentSystem = new PaymentSystem();
    }

    public void purchaseProduct() {
        inventory.updateInventory();
        order.placeOrder();
        paymentSystem.processPayment();
    }
}
