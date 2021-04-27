package at.campus02.iwi;

public class Instrument {
    protected int lautstaerke;
    public Instrument(int l) {
        lautstaerke = l;
    }
    public int play(){
        return lautstaerke;
    }
}
