package behavioural_design_pattern.template;

public abstract class PhoneOrderTemp {

    // method as final because the order of execution of different methods present
    // in it cannot be changed we cannot makePayment() before selecting the product
    final void createOrder() {
        //series of method invocation
        selectProduct();
        packProduct();
        makePayment();
        deliverProduct();
    }

    abstract void selectProduct();

    abstract void makePayment();

    void packProduct() {
        System.out.println("paking the product");
    }

    abstract void deliverProduct();
}
