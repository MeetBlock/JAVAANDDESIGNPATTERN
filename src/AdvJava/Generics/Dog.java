package AdvJava.Generics;

public class Dog extends Animal{

    String name;

    Dog(String name,String type, int wt, int ht) {
        super(type, wt, ht);
        this.name = name;
    }

    Dog(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", wt=" + wt +
                ", ht=" + ht +
                '}';
    }
}
