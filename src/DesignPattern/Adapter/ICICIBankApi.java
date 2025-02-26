package DesignPattern.Adapter;

public class ICICIBankApi {

    public long checkBalance(String usertoken){
        return 1000;
    }

    public char transferMoney(String fromusertoken, String toUsertoken, double amount){
        return 'Y';
    }

    public boolean changePin(String usertoken, int currentpin , int newpin ){
        return true;
    }
}
