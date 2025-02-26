package AccessModifier;

public class Student extends User{
    protected int marks;

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
