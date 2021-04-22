package at.campus02.zam.pr2;

public class Osterhase extends Hase {
    public Osterhase(String name) {
        super(name);
        // hier evtl. initialisierungs code fuer osterhase
    }

    public void versteckeOstereier() {

        System.out.println(name + " versteckt Ostereier");
    }

    @Override
    public void hoppeln(){
        System.out.println(name + " hoppelt herum und versteckt Ostereier");
    }
}
