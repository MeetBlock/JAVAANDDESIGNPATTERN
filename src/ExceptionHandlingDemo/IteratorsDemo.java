package ExceptionHandlingDemo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class IteratorsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.addAll(List.of(10,20,30,40,50,60));

        Iterator<Integer> it = arr.iterator();
//        System.out.println("Current element " + it.next());
//        it.remove();
//
//        it.forEachRemaining(System.out::println);
//        it.forEachRemaining(s -> System.out.println(s));
//
        while(it.hasNext())
        {
            int element = it.next();
            if(element == 30)
            {
                arr.remove(Integer.valueOf(element));
            }else{
                System.out.println(element);
            }
        }

//        TreeSet<Integer> s = new TreeSet<>();
//        s.addAll(List.of(10,20,5,6,7,3,4,8));
//
//        System.out.println("Treeset "+ s);
//
//        Iterator<Integer> tit =  s.iterator();
//
//        while(tit.hasNext()){
//            int element = tit.next();
//            if(element == 5){
//                tit.remove();
//            }else{
//                System.out.println(element);
//            }
//        }

        // iterators are more  safe to loop arraylist, set and map hashmap
        // but while iterator if we try to remove the collection like list, set map
        // then it will throw concurrent modification exception

//        System.out.println("Treeset 2");
//        for(Integer x: s){
//            if(x == 7)
//            {
//                s.remove(Integer.valueOf(x));
//            }
//            System.out.println(x);
//        }
    }

}
