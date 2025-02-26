package FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}

@FunctionalInterface
interface Comparators<T> {
    T comparing(T a1, T b1);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        MathOperation addOpn = (a,b) -> a+b;
        MathOperation subOpn = (a,b) -> a-b;

        System.out.println(addOpn.operate(10,15));
        System.out.println(subOpn.operate(10,15));

        Function<Integer,Integer> add5 = (a) -> a+5;
        Function<Integer,Integer>  sub5 = (a) -> a -5;

        System.out.println(add5.apply(10));
        System.out.println(sub5.apply(10));

        BiFunction<Integer, Integer, Integer> addt = (a,b) -> a+b;
        BiFunction<Integer,Integer,Integer> subt = (a,b) -> a-b;

        System.out.println(addt.apply(10,5));
        System.out.println(subt.apply(25,10));


    }
}
