package ConstructorChaining;

public class B extends A{
    B(){
        System.out.println("Creating B");
    }

    B(String p1, String p2){
        super(p1,p2);
        System.out.println("Parameterised constructor of B");

    }

    int play(){
        int v = super.play();
        System.out.println("A return " + v);
        System.out.println("B is playing");
        return v*v;
    }
}
