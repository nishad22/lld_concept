package creational_design_pattern.singleton;

//this code will work in single-threaded environment but not in mutli-threaded enc
public class LazyInitializationExample {

    private static LazyInitializationExample instance = null;
    private String databaseUrl;
    private String apiKey;

    private LazyInitializationExample() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    public static LazyInitializationExample getInstance() {
        if (instance == null) {
            instance = new LazyInitializationExample();
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void display(){
        System.out.println("Lazy Initialization ");
    }
}
