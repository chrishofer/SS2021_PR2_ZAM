package at.campus02.iwi;
// Flat derives from Property
// additional attributes:
// furnished: with or without furniture
// flatCategory: number between 1 and 3 specifiying flat quality (1 is the best)
public class Flat extends Property{
    protected boolean furnished;
    protected int flatCategory;

    public Flat(String owner, double sizeInM2, String address, boolean furnished, int flatCategory) {
        super(owner, sizeInM2, address);
        this.furnished = furnished;
        this.flatCategory = flatCategory;
    }

    // For Flat category 1 price is 3000 per m2,
    // category 2 is 2700 per m2, category 3 is 1800 per m2
    // furnished adds 300 per m2 for category 1
    // in category 2 and 3 it just adds 5000
    @Override
    public double upfrontCost() {
        return 0;
    }

    // category 1 is m2 * 2 / 3
    // category 2 is m2 * 1.5
    // category 3 is m2 * 3.2
    @Override
    public double monthlyCost() {
        return 0;
    }
}
