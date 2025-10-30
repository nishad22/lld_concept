package creational_design_pattern.builderpattern;

import creational_design_pattern.builderpattern.model.Computer;

public class DirectorBuilder {

    private ComputerBuilder computerBuilder;


    public DirectorBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer constructComputer() {
        return computerBuilder
                .buildProcessor("Intel i7")
                .buildMemory(16)
                .buildStorage(512)
                .buildGraphicsCard("NVIDIA GTX 1660")
                .build();
    }
}
