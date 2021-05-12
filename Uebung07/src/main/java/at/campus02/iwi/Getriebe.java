package at.campus02.iwi;

public class Getriebe {
    private int gang;
    private int minGang;
    private int maxGang;

    public Getriebe(int minGang, int maxGang) {
        this.gang = 0;
        this.minGang = minGang;
        this.maxGang = maxGang;
    }

    public int getGang() {
        return gang;
    }

    public int getMinGang() {
        return minGang;
    }

    public int getMaxGang() {
        return maxGang;
    }

    public void setGang(int gang) throws GetriebeSchutzException, GangExistiertNichtException {
        // check if gang does not exist
        if(gang < minGang || gang > maxGang)
        {
            throw new GangExistiertNichtException("Getriebe besitzt keinen Gang "+ gang);
        }
        // check if we need motor protection
        // think about what we are doing here (this is a short version ;) )
        if(this.gang * gang < 0)
        {
            throw new GetriebeSchutzException("Quäle mich bitte nicht mit solch einem Gangwechsel");
        }
        this.gang = gang;
    }
    public void gangErhoehen() throws GangExistiertNichtException{
        if(gang == maxGang){
            throw new GangExistiertNichtException("Getriebe ist bereits im höchsten Gang");
        }
        ++gang;
    }
    public void gangErniedrigen() throws GangExistiertNichtException{
        if(gang == minGang){
            throw new GangExistiertNichtException("Getriebe ist bereits im niedrigsten Gang");
        }
        --gang;
    }
}
