package DesignPattern.Adapter;

public class YesBankApi {
    public long getBalance(String username, String password){
        return 1000;
    }

        public char doTransaction(String fromusername, String tousername, String fromuserpassword, double amount){
          return 'Y';
    }

    public boolean changePin(String username, String password, int currentpin, int newpin){
        return true;
    }



}
