package at.campus02.zam.pr2;

public class Fraction {
    private int numerator;
    private int denominator;
    public static int nrFractions = 0;

    public Fraction(int n, int d){
        numerator = n;
        denominator = d;
        ++nrFractions;
    }

    public static int getNrFractions(){
        return nrFractions;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public double toDecimal(){
        return (double)numerator / denominator;
    }
    public void print(){
        System.out.println(numerator + " / " + denominator);
    }
    public Fraction multiplicate(Fraction b2){
        int n, d;
        n = numerator * b2.numerator;
        d = denominator * b2.denominator;
        return new Fraction(n, d);
    }
    public Fraction multiplicate(Fraction b2, Fraction b3){
        int n, d;
        n = numerator * b2.numerator * b3.numerator;
        d = denominator * b2.denominator * b3.denominator;
        return new Fraction(n, d);
    }
    public Fraction add(Fraction b2){
        int n, d;
        n = numerator * b2.denominator + b2.numerator * denominator;
        d = denominator * b2.denominator;
        return new Fraction(n, d);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
}
