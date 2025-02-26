package ExceptionHandlingDemo;

import java.sql.SQLOutput;
import java.util.logging.SocketHandler;

public class SimpleRunnable implements Runnable{

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }

    }
}
