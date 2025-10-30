package creational_design_pattern.builderpattern;

import creational_design_pattern.builderpattern.model.Computer;

public interface ComputerBuilder {

    ComputerBuilder buildProcessor(String processor);
    ComputerBuilder buildMemory(int memory);
    ComputerBuilder buildStorage(int storage);
    ComputerBuilder buildGraphicsCard(String graphicsCard);
    Computer build();
}
