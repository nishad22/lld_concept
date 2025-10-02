package creational_design_pattern.abstractfactorypattern.victorian;

import creational_design_pattern.abstractfactorypattern.Table;

public class VictorianTable implements Table {

    @Override
    public void tableType() {
        System.out.println("this is victorian table");
    }
}
