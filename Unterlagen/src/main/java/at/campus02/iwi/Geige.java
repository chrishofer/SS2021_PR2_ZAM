package at.campus02.iwi;

public class Geige extends Instrument {
    public Geige(int l) {
        super(l);

        // just as an example - not necessery here
        // here i call play method
        // this.play();
        // play();
        // here i call play method of base class (Instrument)
        // super.play();
    }
    @Override
    public int play() {
        System.out.println("Geige wird gestrichen");
        return lautstaerke;
    }
}