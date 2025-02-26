package DesignPattern.Adapter;

public class YesBankApiAdapter implements BankApiAdapter{
    private  YesBankApi yesBankApi = new YesBankApi();
    @Override
    public double checkBalance(User user) {
        long balance = yesBankApi.getBalance(user.getUserName(),user.getPassword());
        return (double) balance;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        char result = yesBankApi.doTransaction(fromUser.getUserName(),toUser.getUserName(), fromUser.getPassword(), 1200);

        if(result == 'Y')
        {
            return 1;
        }else if(result == 'n'){
            return 0;
        }else{
            return 2;
        }
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankApi.changePin(user.getUserName(), user.getPassword(),currentPin,newPin);
    }
}
