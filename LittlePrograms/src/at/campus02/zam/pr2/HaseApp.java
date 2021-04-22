package at.campus02.zam.pr2;

public class HaseApp {
    public static void main(String[] args) {
        Osterhase o = new Osterhase("Susi");
        Weihnachtshase w = new Weihnachtshase("Rudi");

        o.hoppeln();
        w.hoppeln();
        System.out.println("---");

        // weisen den osterhasen auf eine hasen refernz zu
        Hase hase = o;


        // ruft trotzdem korrekte überschriebene osterhasen methode auf
        hase.hoppeln();
        // versteckeostereier wird nicht vorgeschlagen da osterhase auf einer Hase Referenz ist
        // aber wir können von einer Hasenreferenz auf eine Osterhase Referenz speichern
        // Achtung es gibt in Summe nur einen Osterhasen: o,o2 und hase beziehen sich alle auf den gleichen Osterhasen
        Osterhase o2 = (Osterhase) hase;
        o2.versteckeOstereier();

        System.out.println("---");
        // erzeugen objekt vom Typ Hasenstall
        Hasenstall hs = new Hasenstall();
        // Fügen unsere beiden Hasen hinzu
        hs.addHase(o);
        hs.addHase(w);

        hs.springtSpringt();
    }
}
