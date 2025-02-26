public class Student {

    int id;
    String name;

    void display()
    {
        System.out.println(id);
        System.out.println(name);
    }

    Student(int id, String name){
        this.id = id;
        this.name = name;

    }
}
