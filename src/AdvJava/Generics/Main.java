package AdvJava.Generics;

import ConstructorChaining.A;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Animal a  =  new Animal("Hippo",230,6);
//        Object o = a;
//        System.out.println(a.toString());

//        Pair p1 =  new Pair(1,"Hello");
//        Pair p2 =  new Pair(10,20);
//        Pair p3 =  new Pair("Dog",a);
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//
//        //Problem
//
//        List<Pair> l = List.of(p1,p2,p3);

//        for(Pair p: l)
//        {
//                Animal o1 = (Animal) p.getFirst();
//                o1.fun();

//            Object o1 = p.getSecond();
//            o1.fun();

//            String first = (String)p.getFirst();
//            System.out.println(p);
//        }
//    ThePair<Integer,Integer> p11 = new ThePair<Integer, Integer>(10,20);
//    p11.getSecond();
//        System.out.println(p11);
//
//    ThePair<Integer,Animal> p12 = new ThePair<Integer, Animal>(2,a);
//    p12.getSecond().fun();
//
//        System.out.println(p12);

        ThePair<Integer,Animal> p = new ThePair<Integer,Animal>(10,new Animal());
        List<Animal> l = List.of(new Animal(),new Animal(),new Animal());
        System.out.println(l);
        p.doSomething(l);

        List<Dog> ld = List.of(new Dog("Lido"),new Dog("Tuff"),new Dog("GIFFY"));

        p.doSomething(ld);

        // RAW TYPES

        ThePair px = new ThePair<>(10,new Animal());

//        px.getSecond().fun();

    }
}
