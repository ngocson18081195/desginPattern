package AbstractFactory;

import animal.*;

import java.util.Random;

public class TwolegAnimalFactory extends AbstractAnimalFactory {
    @Override
    public Animal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(2);
        if (type == 0) {
            return new chicken();
        } else {
            return new Duck();
        }
    }
}
