package Adapter;

import Adapter.bankAPI.ICICBankAPI;

public class ICICBankAPIAdapter implements BankAPIAdapter{

    private ICICBankAPI icicBankAPI;

    public ICICBankAPIAdapter() {
        this.icicBankAPI =  new ICICBankAPI();
    }

    @Override
    public void addAccount(AccountDetails accountDetails) {
        icicBankAPI.addBankAccount(accountDetails.getAccount(),accountDetails.getIFSC());

    }

    @Override
    public double getBalance(AccountDetails accountDetails) {

        return icicBankAPI.checkBalance(accountDetails.getAccount());
    }

    @Override
    public String transfer(AccountDetails fromAccountDetails, AccountDetails toAccountDetails) {
        if (icicBankAPI.transfer(fromAccountDetails.getAccount(),toAccountDetails.getAccount())){
            return "Successfully";
        }
        return "Failed";
    }
}
