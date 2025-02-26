package FunctionalProgramming;

import org.w3c.dom.ls.LSInput;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,5,6,7,8,10,12);

        // Filters out odd numbers
        Stream<Integer> output =  numbers.stream().filter((n)-> n%2 == 0);
        List<Integer> output1 =  numbers.stream().filter((n)-> n%2 == 0)
                .map(n-> 2*n).sorted((a,b)-> -(a-b)).toList();

        numbers.stream().filter((n)-> n%2 == 0)
                .map(n-> 2*n).sorted((a,b)-> -(a-b)).forEach(n-> System.out.println(3*n));


        System.out.println(output);
        System.out.println(output1);

        List<String> names = List.of("Tantia tope","Rani laxmibai","Mangal PANDEY");

        List<Integer> lengths = new LinkedList<>();

        for(String name : names){
            lengths.add(name.length());
        }
        System.out.println(lengths);

        List<Integer> ot1 = names.stream().map(name-> name.length()).toList();
        System.out.println(ot1);

        List<String> OT2 = names.stream().filter(name-> !name.startsWith("T")).map(name->name.toUpperCase()).toList();
        List<String> OT3 = names.stream().filter(name-> !name.startsWith("T")).map(String:: toUpperCase).toList();

        System.out.println(OT2);
        System.out.println(OT3);
        int y=5;
        List<Integer> numerstwo = List.of(1,2,3,4,5,6,7,8,9,14);

        List<Integer> ot4 = numerstwo.stream().filter(n-> n>y).toList();
        System.out.println(ot4);

        Integer ans = numerstwo.stream().filter(n->n%7 ==0).map(n -> n*n).reduce(0,(currentno,currentsum)-> currentno+currentsum);
        Integer ans1 = numerstwo.stream().filter(n->n%7 ==0).map(n -> n*n).reduce(0, Integer :: sum);
        Integer ans2 = numerstwo.stream().filter(n->n%7 ==0).map(n -> n*n).reduce(0, (c,s)-> c+s);
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);

        // parallel stream

        List<Integer> listofNumbers = Arrays.asList(1,2,3,4,10,20,30,40);

        listofNumbers.parallelStream().forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));
    }
}
