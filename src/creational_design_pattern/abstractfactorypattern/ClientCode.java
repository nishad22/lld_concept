package creational_design_pattern.abstractfactorypattern;

import creational_design_pattern.abstractfactorypattern.furniturefactory.ModernFurnitureFactory;
import creational_design_pattern.abstractfactorypattern.furniturefactory.VictorianFurnitureFactory;

public class ClientCode {

    public static void main(String[] args) {

        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Table modernTable = modernFurnitureFactory.createTable();
        Chairs modernChair = modernFurnitureFactory.createChairs();
        modernTable.tableType();
        modernChair.chairType();

        FurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        Table victorianTable = victorianFurnitureFactory.createTable();
        Chairs victorianChair = victorianFurnitureFactory.createChairs();
        victorianTable.tableType();
        victorianChair.chairType();
    }
}
