package creational_design_pattern.singleton;

public class SingletonWithDoubleCheckedLocking {
    private static volatile SingletonWithDoubleCheckedLocking instance = null;
    private String databaseUrl;
    private String apiKey;

    private SingletonWithDoubleCheckedLocking() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    public void display(){
        System.out.println("Lazy Initialization with Double Checked Locking ");
    }

    public static SingletonWithDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonWithDoubleCheckedLocking.class){
                if (instance ==null)
                    instance = new SingletonWithDoubleCheckedLocking();
            }
        }
        return instance;
    }
}
