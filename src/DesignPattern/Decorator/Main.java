package DesignPattern.Decorator;

public class Main extends Object{
    public static void main(String[] args) {
        IceCream ic =  new ChocoChip(
                           new ChocoScoop(
                              new OrangeCone(
                                 new ChocoSyrup(
                                    new ChocoCone()))));

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());

    }
}
