package OOPS4;

public class Dog extends Canine implements Pet,Pet2{

    void greet(){
        System.out.println("Hello from dog");
    }
    @Override
    void bark(){
        System.out.println("woof woof");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public void beFriendly() {
        System.out.println("I am a friendly dog");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    static void animalMethods(){
        System.out.println("Dog Methods");
    }
}
