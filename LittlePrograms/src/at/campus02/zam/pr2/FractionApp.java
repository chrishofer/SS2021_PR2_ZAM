package at.campus02.zam.pr2;

public class FractionApp {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);

        Fraction erg = f1.add(f2);

        erg.print();


        erg.print();
    }
}
