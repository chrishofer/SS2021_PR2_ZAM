package at.campus02.zam.pr2;

public class Address {
    private String street;
    private String zip;
    private String city;
    private String country;

    public Address(String str, String z, String c, String country)
    {
        street = str;
        zip = z;
        city = c;
        this.country = country;
    }
    @Override
    public String toString() {
        return street + " " + zip + " " + city + " " + country;
    }
}
