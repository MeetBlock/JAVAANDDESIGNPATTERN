package OOPS3;

import java.util.*;


public class Main {
    public static void makePayment(User u){
        System.out.println(u.getUsername() + " is  making payment");
        return;
    }

    public static void main(String[] args) {
//        Student s =  new Student();
//        s.username = "vishwameet";
//        s.email = "az@j.com";
//        s.phone_no = "120";
//        s.batch_id = 23451;

//        Instructor i = new Instructor("Visham","a@l.co","http://lkff.co");
//
//        System.out.println(i);



        Student u1 = new Student("Rohan","a@k.c",636382);
        makePayment(u1);

        Instructor ins = new Instructor("SIR","rr@k.co","http:/ioe.c");
        makePayment(ins);
        User u2 = new User("son","s@.sl");

        User ins2 = new Instructor("Prat","r@d.c","http:/hdh.c");


        List<User> l = new ArrayList<>();
        l.add(u1);
        l.add(ins);
        l.add(u2);
        l.add(ins2);

        for (User u : l)
        {
            System.out.println(u);
        }

    }
}
