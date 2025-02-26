package MultiThreading.NumberPrinterExample;

public class Main {
    public static void main(String[] args) {
        for (int i=0;i< 100 ;i++)
        {
            Thread t =  new Thread(new NumberPrinter(i));
            t.start();
        }

//        Thread t1 =  new Thread(new NumberPrinter(2));
//        t1.start();
//
//        Thread t2 =  new Thread(new NumberPrinter(2));
//        t2.start();


    }
}
