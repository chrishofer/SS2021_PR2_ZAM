package at.campus02.iwi;

public class Cello extends Instrument{

    public Cello(int l) {
        super(l);
    }
    @Override
    public int play() {
        System.out.println("Cello wird sanft gestrichen");
        return lautstaerke;
    }
}
