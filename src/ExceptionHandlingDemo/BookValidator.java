package ExceptionHandlingDemo;

public class BookValidator {
    static void validate(String bookname) throws InvalidBookNameException{
        if(!bookname.startsWith("Scaler")){
            throw new InvalidBookNameException("Bookname doesnot start with scaler");
        }else{
            System.out.println("Book Created");
        }
    }

    public static void main(String[] args) {
        try {
            validate("Scaler with java");
            validate("SSI");
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        finally {
            // release memory resources ,close db connection
            System.out.println("Always executed");
        }

        System.out.println("Main also executed");
    }
}
