package creational_design_pattern.builderpattern;

public interface ComputerBuilder {

    ComputerBuilder buildProcessor(String processor);
    ComputerBuilder buildMemory(int memory);
    ComputerBuilder buildStorage(int storage);
    ComputerBuilder buildGraphicsCard(String graphicsCard);
    Computer build();
}
