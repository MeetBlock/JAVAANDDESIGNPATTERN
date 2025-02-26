package ExceptionHandlingDemo;


public class secondHW {
    public static void doSomething(int a , int b){

        if(b==0){
            throw new ArithmeticException("Wrong input values");
        }

    }

    public static void main(String[] args) {
        try {
            doSomething(5,0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
