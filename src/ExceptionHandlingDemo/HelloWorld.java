package ExceptionHandlingDemo;

public class HelloWorld {
    public static void main(String[] args) {
        int a =5;
        int b =0;

        try{
            int result = a/b;
            int ans = a*b;
            System.out.println(ans);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("final");
        }

        System.out.println("Still got executing");
    }
}
