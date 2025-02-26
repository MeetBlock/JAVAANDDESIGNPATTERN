package Bicycle;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle();

        b1.changeCadence(50);
        b1.speedUp(10);
        b1.changeGear(2);
        b1.printStates();

        b1.changeCadence(50);
        b1.speedUp(10);
        b1.changeGear(2);
        b1.printStates();
    }
}
