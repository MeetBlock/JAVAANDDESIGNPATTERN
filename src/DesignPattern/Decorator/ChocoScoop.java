package DesignPattern.Decorator;

public class ChocoScoop implements IceCream{
    private IceCream iceCream;

    public ChocoScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()  + 55;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Choco Scoop, ";
    }
}
