package structural_design_pattern.proxy;

public class Client {

    public static void main(String[] args)
    {
        DatabaseInterface emp1 = new DatabaseProxy("NON ADMIN");
        emp1.executeQuery("READ");
        emp1.executeQuery("WRITE");
        emp1.executeQuery("DELETE");

        DatabaseInterface emp2 = new DatabaseProxy("ADMIN");
        emp2.executeQuery("READ");
        emp2.executeQuery("WRITE");
        emp2.executeQuery("DELETE");

    }
}
