package Bicycle;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newvalue){
        cadence = newvalue;
    }

    void changeGear(int newvalue){
        gear =  newvalue;
    }

    void speedUp(int increment){
        speed = speed + increment;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    void printStates(){
        System.out.println("Cadence :" + cadence + " Speed: " + speed + " Gear: " + gear);
    }
}
