package at.campus02.iwi;
// RentedFlat derives from Flat
// additional attributes:
// kitchenIncluded: ture if kitchen in flat, otherwise false

public class RentedFlat extends Flat {
    protected boolean kitchenIncluded;

    public RentedFlat(String owner, double sizeInM2, String address, boolean furnished, int flatCategory, boolean kitchenIncluded) {
        super(owner, sizeInM2, address, furnished, flatCategory);
        this.kitchenIncluded = kitchenIncluded;
    }
    // here we war no longer obliged to implement the abstract methods
    // we can overwrite if we want but we don't have to


    // For Flat category 1 price 3 times monthly rent (including everything)
    // for category 2 we pay 2 times monthly rent
    // category 3 we pay 1.5 times monthly rent
    @Override
    public double upfrontCost() {
        return super.upfrontCost();
    }

    // category1: m2 * 18 ; for kitchen extra 70
    // category2: m2 * 10; for kitchen extra 40
    // category3: m2 * 7; for kitchen extra 15
    @Override
    public double monthlyCost() {
        return super.monthlyCost();
    }
}
