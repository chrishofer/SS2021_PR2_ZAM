package at.campus02.iwi;

public class Triangel extends Instrument {
    public Triangel(int l) {
        super(l);

    }
    @Override
    public int play() {
        System.out.println("Triangel wird sanft geschlagen");
        return lautstaerke;
    }
}