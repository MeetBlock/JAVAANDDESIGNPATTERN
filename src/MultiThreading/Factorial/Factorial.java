package MultiThreading.Factorial;

import com.sun.source.tree.ReturnTree;

import java.math.*;
import java.util.Objects;

public class Factorial extends  Thread{

    private long number;
    private BigInteger result;

    private boolean isFinished;
    Factorial(long number){
        this.number = number;
        this.result =  BigInteger.valueOf(0);
        this.isFinished = false;
    }

    public BigInteger getResult(){
        return this.result;
    }

    @Override
    public void run(){
        // Business logic
        this.result = factorial(this.number);
        this.isFinished = true;
    }

    private BigInteger factorial(long number){
        if(Objects.equals(BigInteger.valueOf(number), BigInteger.valueOf(0)) || Objects.equals(BigInteger.valueOf(number), BigInteger.valueOf(1))){
            return BigInteger.valueOf(1);
        }
        else{
              return BigInteger.valueOf(number).multiply(factorial(number-1));
        }
    }

    boolean isFinished(){
        return this.isFinished;
    }
}
