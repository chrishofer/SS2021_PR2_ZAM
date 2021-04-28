package at.campus02.iwi;

// House dervies from Property
// additional attributes:
// yearBuilt: the year in which the house was finished
public class House extends Property {
    protected int yearBuilt;

    public House(String owner, double sizeInM2, String address, int yearBuilt) {
        super(owner, sizeInM2, address);
        this.yearBuilt = yearBuilt;
    }

    // For Houses built after 2010 m2 price ist 4000
    // for Houses built between 1950 and including 2010 price is 2000
    // for older houses price is 3000
    @Override
    public double upfrontCost() {
        double c = 0;
        if(yearBuilt > 2010){
            return 4000 * sizeInM2;
        }
        if(yearBuilt >= 1950 && yearBuilt <= 2010)
        {
            return 2000 * sizeInM2;
        }
        // older houses
        return 3000 * sizeInM2;
    }

    // for houses after 2015 cost is m2 / 2
    // houses between 1990 and 2015 m2 * 2.5
    // houses before 1990 m2 * 5
    @Override
    public double monthlyCost() {
        double c = 0;
        if(yearBuilt > 2015){
            return sizeInM2 / 2.0;
        }
        if(yearBuilt >= 1990 && yearBuilt <= 2015)
        {
            return sizeInM2 * 2.5;
        }
        // older houses
        return 5 * sizeInM2;
    }
}
