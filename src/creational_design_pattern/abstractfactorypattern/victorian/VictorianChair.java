package creational_design_pattern.abstractfactorypattern.victorian;

import creational_design_pattern.abstractfactorypattern.Chairs;

public class VictorianChair implements Chairs {

    @Override
    public void chairType() {
        System.out.println("this is victorian chair");
    }
}
