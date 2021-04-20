package at.campus02.zam.pr2;

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account("P1", "iban", "bic");
        Account acc2 = new Account("P2", "iban", "bic");
        Account acc3 = new Account("P3", "iban", "bic");
        acc2.add(100);
        acc2.deposit(50);
        acc3.add(200);
        acc3.deposit(400);

        Account []accounts = new Account[3];
        accounts[0] = acc1;
        accounts[1] = acc2;
        accounts[2] = acc3;

        for(int i = 0; i < accounts.length; ++i){
            System.out.println(accounts[i].getBalance());
        }
    }
}
