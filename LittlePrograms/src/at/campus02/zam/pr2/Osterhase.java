package at.campus02.zam.pr2;

public class Osterhase extends Hase {
    public Osterhase(String name) {
        super(name);
        //hoppeln(); // would call my own hopppeln in line 17
        //super.hoppeln(); // would call implementation in base class (Hase)
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
