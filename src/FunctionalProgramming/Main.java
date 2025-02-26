package FunctionalProgramming;

import java.util.List;

class Person{
    String name;

    String gender;

    Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }


}

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Prateek","MALE"),
                new Person("Rohan","MALE"),
                new Person("Sneha","FEMALE"),
                new Person("Richa","FEMALE")
        );
    }
}
