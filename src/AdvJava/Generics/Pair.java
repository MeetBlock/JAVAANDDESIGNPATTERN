package AdvJava.Generics;

import com.sun.source.tree.ReturnTree;

public class Pair {
    private Object first;
    private Object second;

    Pair(Object first, Object second){
        this.first =first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public Object getFirst(){
        return this.first;
    }


    public  Object getSecond(){
        return this.second;
    }

}

