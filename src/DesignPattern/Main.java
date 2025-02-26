package DesignPattern;

public class Main {


    public static void main(String[] args) {
//        Singleton s1 = Singleton.getObject();
//        System.out.println(s1);
//        Singleton s2 = Singleton.getObject();
//        System.out.println(s2);
//        Singleton s3 = Singleton.getObject();
//        System.out.println(s3);
//        Singleton s4 = Singleton.getObject();
//        System.out.println(s4);

        DbConn d1 = DbConn.getDbconnObject();

        if(d1.connect()){
            System.out.println("d1 is connected");
        }else{
            System.out.println("db1 is not connected");
        }

        DbConn d2 = DbConn.getDbconnObject();

        if(d2.connect()){
            System.out.println("d2 is connected");
        }else{
            System.out.println("db2 is not connected");
        }

        DbConn d3 = DbConn.getDbconnObject();

        if(d3.connect()){
            System.out.println("d3 is connected");
        }else{
            System.out.println("db3 is not connected");
        }

        DbConn d4 = DbConn.getDbconnObject();

        if(d4.connect()){
            System.out.println("d4 is connected");
        }else{
            System.out.println("db4 is not connected");
        }

        DbConn d5 = DbConn.getDbconnObject();

        if(d5.connect()){
            System.out.println("d5 is connected");
        }else{
            System.out.println("db5 is not connected");
        }

        DbConn d6 = DbConn.getDbconnObject();

        if(d6.connect()){
            System.out.println("d6 is connected");
        }else{
            System.out.println("db6 is not connected");
        }

        DbConn d7 = DbConn.getDbconnObject();

        if(d7.connect()){
            System.out.println("d7 is connected");
        }else{
            System.out.println("db7 is not connected");
        }

        DbConn d8 = DbConn.getDbconnObject();
        if(d8.connect()){
            System.out.println("d8 is connected");
        }else{
            System.out.println("db8 is not connected");
        }

        DbConn d9 = DbConn.getDbconnObject();
        if(d9.connect()){
            System.out.println("d9 is connected");
        }else{
            System.out.println("db9 is not connected");
        }

        DbConn d10 = DbConn.getDbconnObject();
        if(d10.connect()){
            System.out.println("d10 is connected");
        }else{
            System.out.println("db10 is not connected");
        }

        DbConn d11 = DbConn.getDbconnObject();

        if(d11.connect()){
            System.out.println("d11 is connected");
        }else{
            System.out.println("db11 is not connected");
        }



    }
}
