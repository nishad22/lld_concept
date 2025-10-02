package creational_design_pattern.singleton;

public class SingletonInMutliThreadedEnv {

    private static SingletonInMutliThreadedEnv instance = null;
    private String databaseUrl;
    private String apiKey;

    private SingletonInMutliThreadedEnv() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    public void display(){
        System.out.println("Lazy Initialization In multi-threaded ");
    }

    public static synchronized SingletonInMutliThreadedEnv getInstance() {
        if (instance == null) {
            instance = new SingletonInMutliThreadedEnv();
        }
        return instance;
    }
}
