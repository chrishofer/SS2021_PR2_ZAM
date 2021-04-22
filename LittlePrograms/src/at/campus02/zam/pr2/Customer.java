package at.campus02.zam.pr2;

import java.util.ArrayList;

public class Customer {
    private int customerNumber;
    private ArrayList<Address> addresses;

    public Customer(int nr)
    {
        customerNumber = nr;
        addresses = new ArrayList<Address>();
    }

    public void addAddress(Address a)
    {
        addresses.add(a);

    }

    @Override
    public String toString() {
        return  customerNumber + "\n" + addresses;
    }
}
