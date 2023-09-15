package Adapter;

import Adapter.bankAPI.YESBankAPI;

public class YESBankAPIAdapter implements BankAPIAdapter{
    YESBankAPI yesBankAPI;

    public YESBankAPIAdapter() {
        this.yesBankAPI = new YESBankAPI();
    }

    @Override
    public void addAccount(AccountDetails accountDetails) {
        yesBankAPI.addBank(accountDetails.getAccount(),accountDetails.getName(),accountDetails.getIFSC());

    }

    @Override
    public double getBalance(AccountDetails accountDetails) {
        return yesBankAPI.getBalance(accountDetails.getAccount());
    }

    @Override
    public String transfer(AccountDetails fromAccountDetails, AccountDetails toAccountDetails) {
        String upi = toAccountDetails.getName() + toAccountDetails.getIFSC() + "@api";
        if (yesBankAPI.pay(upi).equals("YES")){
            return "Successful";
        }
        return "Failed";
    }
}
