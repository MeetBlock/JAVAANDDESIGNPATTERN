package ConstructorChaining;

public class A {

    String prop1;
    String prop2;
    A(){
        System.out.println("Creatinig A");
    }

    A(String p1, String p2){
        System.out.println("Parameterised constructor of A");
        this.prop1 = p1;
        this.prop2 = p2;
    }

    int play(){
        System.out.println("A is playing");
        return 6;
    }
}
