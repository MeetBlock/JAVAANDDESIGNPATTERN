package OOPS4;

public abstract class Animal {

    void greet(){
        System.out.println("Hi");
    }

    void bark(){
        System.out.println("bhaw bhaw");
    }

    public abstract void eat();

    public void play(){

    }

    static void animalMethods(){
        System.out.println("Animal methods");
    }
}
