package creational_design_pattern.singleton;

public class SingletonWithSynchronizedBlock {

    private static SingletonWithSynchronizedBlock instance = null;
    private String databaseUrl;
    private String apiKey;

    private SingletonWithSynchronizedBlock() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    public void display(){
        System.out.println("Lazy Initialization with Synchronized block ");
    }

    public static SingletonWithSynchronizedBlock getInstance() {
        if (instance == null) {
            //class level locking
            synchronized (SingletonWithSynchronizedBlock.class){
                instance = new SingletonWithSynchronizedBlock();
            }
        }
        return instance;
    }
}
