package at.campus02.iwi;

import java.util.ArrayList;

public class LogisticManager {
    protected ArrayList<Movable> lm;
    public LogisticManager() {
        lm = new ArrayList<Movable>();
    }
    public void addMovable(Movable m)
    {
        lm.add(m); // mit strg + q hilfe aufrufen
    }
    public void moveAll(String destination)
    {
        for(Movable mov : lm)
        {
            mov.move(destination);
        }
    }
}