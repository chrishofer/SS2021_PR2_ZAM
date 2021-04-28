package at.campus02.iwi;

public class PropertyApp {
    public static void main(String[] args) {
        // test the stuff
        RentedFlat rf = new RentedFlat("Ms. Wrigly", 100, "Flat Street 12", true, 1, true);
        System.out.println(rf.upfrontCost());
        System.out.println(rf.monthlyCost());

        Flat f = new Flat("Ms. Wrigly", 100, "Flat Street 15", false, 2);
        System.out.println(f.upfrontCost());
        System.out.println(f.monthlyCost());

        House h = new House("Mr. Owner", 50, "House Lane 2", 2017);
        System.out.println(h.upfrontCost());
        System.out.println(h.monthlyCost());
    }
}
