package at.campus02.zam.pr2;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;
    private static int uniqueID = 1;

    public Account(String o, String i, String b){
        owner = o;
        iban = i;
        bic = b;
        balance = 0;
        accountID = uniqueID++;
    }
    public void add(double value){
        balance += value;
    }
    public double deposit(double value){
        double dep;
        if(value >= balance) {
            dep = balance;
            balance = 0;
        }else{
            dep = value;
            balance -= value;
        }
        return dep;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }
}
