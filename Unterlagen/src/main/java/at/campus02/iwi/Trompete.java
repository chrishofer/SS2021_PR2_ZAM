package at.campus02.iwi;

public class Trompete extends Instrument {
    public Trompete(int l) {
        super(l);

    }
    @Override
    public int play() {
        System.out.println("Trompete wird geblasen");
        return lautstaerke;
    }
}