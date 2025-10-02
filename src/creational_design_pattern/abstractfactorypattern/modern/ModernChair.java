package creational_design_pattern.abstractfactorypattern.modern;

import creational_design_pattern.abstractfactorypattern.Chairs;

public class ModernChair implements Chairs {

    @Override
    public void chairType() {
        System.out.println("this is modern chair");
    }
}
