package at.campus02.zam.pr2;

public class PropertyApp {
    public static void main(String[] args) {
        Property grund = new Property(42, 15, 1000, "Hansi");

        grund.addOwner("Raika", 10000);
        System.out.println(grund.removeOwner("Raaaika"));
        System.out.println(grund.removeOwner("Raika"));
        System.out.println(grund.payback("Raaaika", 1000));
        System.out.println(grund.payback("Raika", 100000));
        System.out.println("***");
        System.out.println(grund.payback("Raika", 7000));
        System.out.println(grund.removeOwner("Raika"));
        System.out.println("***");
        System.out.println(grund.payback("Raika", 3000));
        System.out.println(grund.removeOwner("Raika"));
    }
}
