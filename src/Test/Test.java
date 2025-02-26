package Test;

import java.util.Arrays;

public class Test {

    public int n;
    public int arr[];
    public Test(int n){
        this.n = n;
        this.arr =  new int[n];

        for(int i= 0; i<n;i++)
        {
            arr[i] = i+1;
        }

    }

    public Test(Test X){
        this.n = X.n;
        this.arr = X.arr;

        this.arr = new int[this.n];
        for(int i=0;i<this.n;i++)
        {
            this.arr[i] = X.arr[i];
        }



    }

    @Override
    public String toString() {
        return "Test{" +
                "n=" + n +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        Test t1 =  new Test(5);
        System.out.println(t1);

        Test t2 =  new Test(t1);
        t2.n = 6;
        t2.arr[0] = 5;
        System.out.println(t1);
        System.out.println(t2);

    }
}
