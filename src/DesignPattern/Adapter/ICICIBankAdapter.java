package DesignPattern.Adapter;

public class ICICIBankAdapter implements BankApiAdapter{

    private ICICIBankApi iciciBankApi =  new ICICIBankApi();
    @Override
    public double checkBalance(User user) {
        double balance = iciciBankApi.checkBalance(generateToken(user));
        return (double) balance;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        char res = iciciBankApi.transferMoney(generateToken(fromUser),generateToken(toUser),amount);
        if(res == 'Y'){
            return 1;
        }else if(res == 'N'){
            return  0;
        }else{
            return 2;
        }
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return iciciBankApi.changePin(generateToken(user), currentPin,newPin);
    }

    private String generateToken(User user){
        return user.getUserName() + user.getPassword();
    }
}
