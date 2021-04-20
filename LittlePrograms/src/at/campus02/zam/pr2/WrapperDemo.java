package at.campus02.zam.pr2;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer number;
        Integer number2;

        number = new Integer(222);
        int i = number.intValue() * 2;
        System.out.println(i);

        // da autoboxing - primitive type and class type can be exchanged for each other
        number2 = 222; // new Integer ist not necesseary but we still get an instance of an object
        int j = number2 + 7; // should not work because Integer + int but it works due to autoboxing

        String doubleNr = "7.456";
        System.out.println(doubleNr + 1000); // because doulbeNr ist string we get cocatenation

        // we can convert do number
        double d = Double.parseDouble(doubleNr);
        System.out.println(d + 1000);
    }
}
