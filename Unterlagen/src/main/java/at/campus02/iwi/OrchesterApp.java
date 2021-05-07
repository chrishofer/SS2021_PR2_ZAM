package at.campus02.iwi;

public class OrchesterApp {
    public static void main(String[] args) {
        Geige g = new Geige(4);
        Trompete t = new Trompete(7);
        Triangel tr = new Triangel(3);
        Cello c = new Cello(10);
        Orchester orch = new Orchester();

        orch.addInstrument(g);
        orch.addInstrument(t);
        orch.addInstrument(tr);
        orch.addInstrument(c);

        System.out.println(orch.playAll());
    }
}
