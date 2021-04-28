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
        switch(flatCategory){
            case 1:
                return 3 * monthlyCost();
            case 2:
                return 2 * monthlyCost();
            case 3:
                return 1.5 * monthlyCost();
        }
        return 0;
    }

    // category1: m2 * 18 ; for kitchen extra 70
    // category2: m2 * 10; for kitchen extra 40
    // category3: m2 * 7; for kitchen extra 15
    @Override
    public double monthlyCost() {
        double c = 0;
        switch(flatCategory){
            case 1:
                c = sizeInM2 * 18;
                if(kitchenIncluded){
                    c += 70;
                }
                break;
            case 2:
                c = sizeInM2 * 10;
                if(kitchenIncluded){
                    c += 40;
                }
                break;
            case 3:
                c = sizeInM2 * 7;
                if(kitchenIncluded){
                    c += 15;
                }
                break;
        }
        return c;
    }
}
