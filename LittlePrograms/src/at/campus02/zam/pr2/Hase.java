package at.campus02.zam.pr2;

public class Hase{
    protected String name;

    public Hase(String n) {

        name = n;
    }


    public void schlafen() {
        System.out.println(name + " schläft");
    }

    public void hoppeln() {
        System.out.println(name + " hoppelt");
    }

    public void fressen() {
        System.out.println(name + " frisst");
    }

}
