package CollectionDemo.MethodLevelGenerics;

public class Triplet<T> {
    T first;
    T second;

    T third;

    Triplet(){

    }

    Triplet(T first, T second, T third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Triplet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
