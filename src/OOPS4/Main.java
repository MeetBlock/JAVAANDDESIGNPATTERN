package OOPS4;

import java.util.function.DoubleFunction;

public class Main {
    public static void main(String[] args) {

        Animal a1 =  new Dog();
        Animal a2 = new Hippo();

        Dog d =  new Dog();

        a1.greet();
        a2.greet();

        d.greet();
        a1.bark();
        a1.eat();
        a2.eat();

        a1.bark();

        a1.animalMethods();
        d.animalMethods();
    }
}
