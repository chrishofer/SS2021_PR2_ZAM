package at.campus02.iwi;

public abstract class Instrument {
    protected int lautstaerke;
    public Instrument(int l) {
        lautstaerke = l;
    }


    public abstract int play();
}
