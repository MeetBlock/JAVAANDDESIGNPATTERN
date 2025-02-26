package DesignPattern.Decorator;

public class ChocoSyrup implements  IceCream{
    private IceCream iceCream;

    public ChocoSyrup(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()  + 15;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Choco Syrup, ";
    }
}
