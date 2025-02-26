package CallableDemo;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arr;
    ExecutorService executor;

    Sorter(List<Integer> arr, ExecutorService executor){
        this.arr = arr;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        // Business Logic

        if(arr.size() <= 1)
        {
            return arr;
        }
        int n = arr.size();
        int mid = n/2;

        List<Integer> leftArray =  new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i= 0;i<n ;i++)
        {
            if(i < mid)
            {
                leftArray.add(this.arr.get(i));
            }else{
                rightArray.add(this.arr.get(i));
            }
        }

        // recursive sort two arrays

        Sorter leftSorter = new Sorter(leftArray,executor);
        Sorter rightSorter = new Sorter(rightArray,executor);
//        leftArray = leftSorter.call();
//        rightArray = rightSorter.call();


        Future<List<Integer>> leftFuture = executor.submit(leftSorter);
        Future<List<Integer>> rightFuture = executor.submit(rightSorter);

        leftArray = leftFuture.get();
        rightArray = rightFuture.get();


        // Merge

        List<Integer> output =  new ArrayList<>();

        int  i = 0;
        int  j = 0;
        while(i<leftArray.size() && j<rightArray.size()){
            if(leftArray.get(i) < rightArray.get(j)){
                output.add(leftArray.get(i));
                i++;
            }else{
                output.add(rightArray.get(j));
                j++;
            }
        }

        while (i<leftArray.size())
        {
            output.add(leftArray.get(i));
            i++;
        }

        while(j<rightArray.size())
        {
            output.add(rightArray.get(j));
            j++;
        }
        return output;
    }
}
