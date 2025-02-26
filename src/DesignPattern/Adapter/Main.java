package DesignPattern.Adapter;

public class Main {
    public static void main(String[] args) {

        BankApiAdapter bankApiAdapter = new ICICIBankAdapter();
//        BankApiAdapter bankApiAdapter = new YesBankApiAdapter();
        Phonepe ph = new Phonepe(bankApiAdapter);

        ph.checkBalance(new User("Rahul","1234"));
        ph.transferMoney(new User("Rahul","344"),new User("AKAS","8493"),343);
    }
}
