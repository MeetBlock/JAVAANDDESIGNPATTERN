// this is base add on , it can act as base addon or normal as well
package DesignPattern.Decorator;

public class OrangeCone implements IceCream{

    private IceCream iceCream;
    public OrangeCone(){

    }

    public OrangeCone(IceCream iceCream) {  // when the cone is being added on top of add on
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream !=null){
            return  iceCream.getCost() + 10;
        }else {
            return 10;
        }
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + "Orange Cone, ";
        }else{
            return "Orange Cone, ";
        }
    }
}
