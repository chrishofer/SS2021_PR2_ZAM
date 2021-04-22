package at.campus02.zam.pr2;

public class UpcastingDemo {
    public static void main(String[] args) {
        Dog d;
        Beagle b = new Beagle("Spaghetti");
        b.eyeColor = "blue";
        b.weight = 10;

        b.bark();
        b.jump(10);

        d = b;
        // what can i do now with d reference?
        // we can just do dog stuff but not beagle stuff (no jumping no favorit food)

        Object o = b;
        // what can we do know?
        System.out.println(o.toString());
    }
}
