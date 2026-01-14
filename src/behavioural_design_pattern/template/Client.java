package behavioural_design_pattern.template;

public class Client {

    public static void main(String[] args) {
        PhoneOrderTemp offlineStore = new OfflineStore();
        //offlineStore.createOrder();

        PhoneOrderTemp onlineStore = new OnlineStore();
        onlineStore.createOrder();
    }
}
