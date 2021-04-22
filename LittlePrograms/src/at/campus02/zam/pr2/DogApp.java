package at.campus02.zam.pr2;

public class DogApp {
    public static void main(String[] args) {
        // just a dog
        Dog d = new Dog();
        d.eyeColor = "brown";
        d.weight = 10;
        d.bark();
        System.out.println(d);

        // test a beagle
        Beagle b = new Beagle("tuna");
        b.eyeColor = "blue";
        b.weight = 12;
        b.bark();
        System.out.println(b);
    }
}
