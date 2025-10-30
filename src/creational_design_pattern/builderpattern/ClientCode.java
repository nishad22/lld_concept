package creational_design_pattern.builderpattern;

import creational_design_pattern.builderpattern.model.Computer;

public class ClientCode {

    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new DesktopComputerBuilder();
        DirectorBuilder directorBuilder = new DirectorBuilder(computerBuilder);
        Computer computer = directorBuilder.constructComputer();
        System.out.println(computer);
    }
}
