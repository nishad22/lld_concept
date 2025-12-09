package structural_design_pattern.proxy;

import java.util.Objects;

public class DatabaseProxy implements DatabaseInterface {

    private String id;
    private Database database;

    public DatabaseProxy(String id) {
        this.id = id;
        this.database = new Database();
    }

    @Override
    public void executeQuery(String queryType) {

        if (queryType.equalsIgnoreCase("DELETE") && Objects.equals(this.id, "ADMIN")) {

            System.out.println("cannot execute the query , admin permission is needed");
            return;
        }
        database.execute(queryType,this.id);

    }
}
