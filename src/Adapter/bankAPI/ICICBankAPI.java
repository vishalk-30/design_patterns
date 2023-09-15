package Adapter.bankAPI;

public class ICICBankAPI {
    public double checkBalance(int accountId){
        return 600;
    }
    public char addBankAccount(int accountId, String IFSC){
        return 'y';
    }

    public boolean transfer(int fromAccountId, int toAccountId){
        return true;
    }
}
