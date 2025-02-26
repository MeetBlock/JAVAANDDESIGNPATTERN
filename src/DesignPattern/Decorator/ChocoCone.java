package DesignPattern.Decorator;
// this is base add it can act as base addon or normal as well
public class ChocoCone implements IceCream{

    private IceCream iceCream;

    public ChocoCone(){

    }
    public ChocoCone(IceCream iceCream) {  // when the cone is being added on top of add on
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream !=null){
            return  iceCream.getCost() + 20;
        }else {
            return 20;
        }
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + "Chocolate Cone, ";
        }else{
            return "Chocolate Cone, ";
        }
    }
}
