package Adapter.bankAPI;

public class YESBankAPI {

    public int getBalance(int accountId){
        return 200;
    }

    public boolean addBank(int accountId, String name, String IFSC){
        return true;
    }

    public String  pay(String upiId){
        return "YES";
    }
}
