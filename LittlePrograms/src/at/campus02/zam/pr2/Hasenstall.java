package at.campus02.zam.pr2;
import java.util.ArrayList;
public class Hasenstall {
    // ArrayList mit Basisklasse damit alle abgeleiteten Klassen auch aufgenommen werden
    private ArrayList<Hase> stall;
    public Hasenstall(){
        // initialisieren ArrayList
        stall = new ArrayList<Hase>();
    }
    public void addHase(Hase h){
        stall.add(h);
    }

    public void springtSpringt()
    {
        for (Hase h : stall) {
            h.hoppeln();
        }

    }
}