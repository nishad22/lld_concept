package creational_design_pattern.abstractfactorypattern.furniturefactory;

import creational_design_pattern.abstractfactorypattern.Chairs;
import creational_design_pattern.abstractfactorypattern.FurnitureFactory;
import creational_design_pattern.abstractfactorypattern.Table;
import creational_design_pattern.abstractfactorypattern.victorian.VictorianChair;
import creational_design_pattern.abstractfactorypattern.victorian.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Chairs createChairs() {
        return new VictorianChair();
    }
}
