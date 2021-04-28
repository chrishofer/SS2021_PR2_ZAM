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
        // as an example an implementation with ifs

        double c = 0;
        if(flatCategory == 1)
        {
            c = 3000 * sizeInM2 ;
            if(furnished){
                c += 300 * sizeInM2;
            }
        }else{
            if(flatCategory == 2){
                c = 2700 * sizeInM2;
                if(furnished){
                    c += 5000;
                }
            }else{
                if(flatCategory == 3){
                    c = 1800 * sizeInM2;
                    if(furnished){
                        c += 5000;
                    }
                }
            }
        }

        return c;
    }

    // category 1 is m2 * 2 / 3
    // category 2 is m2 * 1.5
    // category 3 is m2 * 3.2
    @Override
    public double monthlyCost() {
        switch(flatCategory){
            case 1:
                return sizeInM2 * 2 / 3;
            case 2:
                return sizeInM2 * 1.5;
            case 3:
                return sizeInM2 * 3.2;
        }
        return 0;
    }
}
