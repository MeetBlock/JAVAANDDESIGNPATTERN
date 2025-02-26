package OOPS3;


import java.util.*;

public class Instructor extends User {
    String linkedinurl;
    List<String> subjects;

    @Override
    public String toString() {
        return "Instructor{" +
                "linkedinurl='" + linkedinurl + '\'' +
                ", subjects=" + subjects +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone_no='" + phone_no + '\'' +
                '}';
    }

    Instructor(String username, String email, String linkedin){
        super(username,email);
        this.linkedinurl = linkedin;
        System.out.println("Creating a Instructor");
    }
}
