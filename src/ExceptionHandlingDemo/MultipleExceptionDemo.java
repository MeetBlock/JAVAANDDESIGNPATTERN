package ExceptionHandlingDemo;

public class MultipleExceptionDemo {
    public static void main(String[] args) {
        try{
            int arr[] = new int[10];
            arr[10] = 5/0;
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e);
//            throw new RuntimeException(e);
        }
//        catch (ArithmeticException e2){
//            System.out.println(e2.getMessage());
//            System.out.println(e2);
//        }
    }
}
