package at.campus02.iwi;

public class AnimalApp {
    public static void main(String[] args) {
        // part 1
        Frog quaxi = new Frog("green", 2);
        // upcasting works automatically nevertheless we could (Animal) quaxi
        Animal quaxiAsAnimal = quaxi;
        //quaxiAsAnimal = new Lion("brown", 2);
        Frog sameQuaxi = (Frog)quaxiAsAnimal; // only works if there is really a frog on it

        quaxi.makeNoise();
        quaxiAsAnimal.makeNoise(); // as animal we can only use animal methods (no frog methods if he had more)
        sameQuaxi.makeNoise();


        // part 2
        Nature n = new Nature();
        n.addAnimal(quaxi);
        n.addAnimal(new Lion("red", 8));
        n.addAnimal(new Frog("green", 2));

        System.out.println(n.countColor("red"));
        System.out.println(n.countColor("green"));
    }
}
