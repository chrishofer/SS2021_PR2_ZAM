package at.campus02.iwi;

public class PropertyApp {
    public static void main(String[] args) {
        // test the stuff
        RentedFlat rf = new RentedFlat("Ms. Wrigly", 100, "Flat Street 12", true, 1, true);
        System.out.println(rf.upfrontCost());
        System.out.println(rf.monthlyCost());
    }
}
