package creational_design_pattern.abstractfactorypattern.modern;

import creational_design_pattern.abstractfactorypattern.Table;

public class ModernTable implements Table {

    @Override
    public void tableType() {
        System.out.println("this is modern table");
    }
}
