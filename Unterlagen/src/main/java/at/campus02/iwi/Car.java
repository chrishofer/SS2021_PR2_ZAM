package at.campus02.iwi;

public class Car implements Movable {
    protected String type, color;
    protected int weight;
    public Car(String t, String c, int w) {
        type = t;
        color = c;
        weight = w;
    }
    @Override
    public void move(String destination) {
        System.out.println(type + " in Farbe " + color + " und mit Gewicht " + weight + " faehrt nach " + destination);
    }
}