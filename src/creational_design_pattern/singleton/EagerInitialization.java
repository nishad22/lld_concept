package creational_design_pattern.singleton;

public class EagerInitialization {

    // Step 1: Create a private static instance variable
    private static final EagerInitialization instance = new EagerInitialization();

    private String databaseUrl;
    private String apiKey;

    // Step 2: Make the constructor private to prevent external instantiat
    private EagerInitialization() {
        // Private constructor to prevent instantiation
        // Initialize default settings
        this.databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
        this.apiKey = "default-api-key";
    }

    public static EagerInitialization getInstance() {
        return instance;
    }

    // Getter and setter methods for application settings
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

    public void displayConfiguration() {
        System.out.println("Eager Initialization");
        System.out.println("Database URL: " + databaseUrl);
        System.out.println("API Key: " + apiKey);
    }

}
