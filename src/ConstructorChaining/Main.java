package ConstructorChaining;

public class Main {
    public static void main(String[] args) {
//        C c =  new C("Red","Green","Blue");
//        System.out.println(c);
//        B b = new B();

        B b = new B();
        int res = b.play();
        System.out.println(res);
    }
}
