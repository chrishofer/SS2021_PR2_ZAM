package at.campus02.zam.pr2;

public class Dog {
    public String eyeColor;
    public int weight;

    public void bark(){
        System.out.println("Bark bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
