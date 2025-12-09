package structural_design_pattern.proxy;

public class Database {

    void execute(String queryType, String id){
        System.out.println("executing the query : " + queryType);
    }
}
