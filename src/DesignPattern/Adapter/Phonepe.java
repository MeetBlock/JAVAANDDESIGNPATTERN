package DesignPattern.Adapter;

public class Phonepe {

    private BankApiAdapter bankApiAdapter;

    public Phonepe(BankApiAdapter bankApiAdapter) {
//        this.bankApiAdapter = new YesBankApiAdapter();
        this.bankApiAdapter = new ICICIBankAdapter();
    }

    public void checkBalance(User user){
        double balance = bankApiAdapter.checkBalance(user);
        System.out.println("Balance = "+ balance);
    }

    public void transferMoney(User fromUser, User toUser, double amount){
        if(bankApiAdapter.checkBalance(fromUser) < amount){
            System.out.println("Transaction failed");
        }
        int status = bankApiAdapter.doTransaction(fromUser,toUser,amount);

        switch (status){
            case 1:
                System.out.println("SUCCESSFULL");
                break;
            case 0:
                System.out.println("FAILED");
                break;
            default:
                System.out.println("IN PROGRESS");
                break;
        }

        // deduct amount
    }

    public void changePin(User user , int currentPin, int newPin){

        bankApiAdapter.changePin(user,currentPin,newPin);
    }
}

