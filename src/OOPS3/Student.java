package OOPS3;

public class Student extends User{

    int batch_id;

    @Override
    public String toString() {
        return "Student{" +
                "batch_id=" + batch_id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone_no='" + phone_no + '\'' +
                '}';
    }

    Student(){
        System.out.println("Creating a Student");
    }

    Student(String username,String email, int batchid)
    {
        super(username,email);
        this.batch_id = batchid;
    }
}
