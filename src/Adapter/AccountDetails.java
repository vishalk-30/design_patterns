package Adapter;

public class AccountDetails {
    private int account;
    private String name;
    private String IFSC;

    public AccountDetails(int account, String name, String IFSC) {
        this.account = account;
        this.name = name;
        this.IFSC = IFSC;
    }

    public AccountDetails() {
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }
}
