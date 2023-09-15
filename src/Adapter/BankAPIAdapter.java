package Adapter;

public interface BankAPIAdapter {
    void addAccount(AccountDetails accountDetails);

    double getBalance(AccountDetails accountDetails);

    String transfer( AccountDetails fromAccountDetails, AccountDetails toAccountDetails);

}
