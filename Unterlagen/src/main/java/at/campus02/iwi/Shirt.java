package at.campus02.iwi;

public class Shirt implements Movable {
    protected String brand, size, color;
    public Shirt(String b, String s, String c) {
        brand = b;
        size = s;
        color = c;
    }
    @Override
    public void move(String destination) {

        System.out.println(brand + " in Groesse " + size + " und Farbe " + color + " nach " + destination);
    }

}