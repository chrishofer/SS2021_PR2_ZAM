package at.campus02.zam.pr2;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses;

    public Customer(int nr, String fName, String lName)
    {
        super(fName, lName);
        //super("Hansi", "Hinterseer"); // schlechte Lösung
        customerNumber = nr;
        addresses = new ArrayList<Address>();
    }

    public void addAddress(Address a)
    {
        addresses.add(a);

    }

    @Override
    public String toString() {
        return  customerNumber + " " + firstName + " " + lastName + "\n" + addresses;
    }
}
