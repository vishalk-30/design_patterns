package Adapter;

public class PhonePe {
    BankAPIAdapter bankAPIAdapter = new ICICBankAPIAdapter();

    AccountDetails accountDetails = new AccountDetails();

    public void getBalance(){
        double balance = bankAPIAdapter.getBalance(accountDetails);
        System.out.println("Balance is : " + balance);
    }

    public void addBankAccount(){
        bankAPIAdapter.addAccount(accountDetails);

    }

    public void transferAmount(AccountDetails accountDetails2){
        bankAPIAdapter.transfer(accountDetails,accountDetails2);

    }




}
