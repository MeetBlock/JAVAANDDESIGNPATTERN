package DesignPattern.Decorator;

public class ChocoChip implements IceCream{
    private IceCream iceCream;

    public ChocoChip(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()  + 10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Choco Chip, ";
    }
}
