package at.campus02.zam.pr2;

public class Weihnachtshase extends Hase {
    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteileGeschenke() {
        System.out.println(name + " \"organisiert\" sich Geschenke vom Weihnachtsmann und verteilt sie");
    }

    @Override
    public void hoppeln() {
        System.out.println(name + " hoppelt durch den Schnee");
    }

}