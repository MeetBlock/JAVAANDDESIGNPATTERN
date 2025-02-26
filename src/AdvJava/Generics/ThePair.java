package AdvJava.Generics;

import java.util.List;

public class ThePair<T,U> {
    T first;
    U second;

    ThePair(T first,U second){
        this.first = first;
        this.second = second;
    }


    public T getFirst(){
        return  this.first;
    }

    public U getSecond(){
        return this.second;
    }

    @Override
    public String toString() {
        return "ThePair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    void doSomething(List<? extends U> l){
        for(U obj: l){
            System.out.println(obj);
        }

    }
}
