package at.campus02.iwi;

import java.util.ArrayList;

public class Orchester {
    protected ArrayList<Instrument> o;
    public Orchester() {
        o = new ArrayList<Instrument>();
    }
    public void addInstrument(Instrument i)
    {
        o.add(i);
    }
    public int playAll()
    {
        int l = 0;

        for(Instrument inst : o)
        {
            l = l + inst.play();
        }
        return l;
    }
}
