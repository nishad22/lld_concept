package creational_design_pattern.abstractfactorypattern.furniturefactory;

import creational_design_pattern.abstractfactorypattern.Chairs;
import creational_design_pattern.abstractfactorypattern.FurnitureFactory;
import creational_design_pattern.abstractfactorypattern.Table;
import creational_design_pattern.abstractfactorypattern.modern.ModernChair;
import creational_design_pattern.abstractfactorypattern.modern.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Chairs createChairs() {
        return new ModernChair();
    }
}
