package DesignPattern.Decorator;

// normal addon always can be addded after base add on that is some form of ice cream
public class VanillaScoop implements IceCream{

    private IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()  + 35;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Vanilla Scoop, ";
    }
}
