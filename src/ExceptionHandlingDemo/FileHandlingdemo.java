package ExceptionHandlingDemo;

import  java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandlingdemo {
    public static void findFile(String name) throws IOException
    {
        File newfile =  new File(name);
        FileInputStream str = new FileInputStream(newfile);

    }

    public static void main(String[] args) {

        try {
            findFile("a.txt");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
