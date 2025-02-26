package CollectionDemo.MethodLevelGenerics;

import OOPS4.Dog;

public class Main {

    public static <T> T getSecond(Triplet<T> t){
//        System.out.println(t.getSecond());
        return t.getSecond();
    }
    public static <T> void displayTriplet(Triplet<T> t){
        System.out.println(t);
    }


    public static <TYPE> TYPE printThirdAttribute(Triplet<TYPE> t){
//        System.out.println(t.getThird());
        return t.getThird();
    }

    public static void printFirstAttribute(Triplet<?> t){
        System.out.println(t.getFirst());
    }

    public static void doubleFirstAttribute(Triplet<? extends Number> t){
        System.out.println(t.getFirst().doubleValue()*2);
    }

    public static double getAverage(Triplet<? extends Number> t){
        return  (t.getFirst().doubleValue() + t.getSecond().doubleValue() + t.getThird().doubleValue())/ 3.0;

    }

    public static void main(String[] args) {
        Triplet<Integer> t1 = new Triplet<>(10,20,30);
        Triplet<Double> t2 = new Triplet<>(10.0,20.3,30.4);
        Triplet<String> t3 = new Triplet<>("hello","Bye","tata");

        displayTriplet(t1);
        System.out.println(getSecond(t1));
        System.out.println(getSecond(t3));
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        doubleFirstAttribute(t1);

    }
}
