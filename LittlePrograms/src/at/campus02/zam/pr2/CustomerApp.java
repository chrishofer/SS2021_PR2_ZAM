package at.campus02.zam.pr2;

public class CustomerApp {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Hansi", "Hinterseer");
        Customer c2 = new Customer(2, "Susi", "Werter");


        c1.addAddress(new Address("Street", "8010", "Graz", "Austria"));
        c2.addAddress(new Address("Str. 2", "8020", "Graz", "Austria"));
        c2.addAddress(new Address("Str. 3", "1010", "Wien", "Austria"));

        System.out.println(c1);
        System.out.println(c2);

        c1.doSomething();
    }
}
