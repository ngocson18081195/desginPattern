package AbstractFactory;

import animal.Animal;
import animal.Cat;
import animal.Dog;

import java.util.Random;

public class FourlegAnimalFactory extends AbstractAnimalFactory {
    @Override
    public Animal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(2);
        if (type == 0) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
