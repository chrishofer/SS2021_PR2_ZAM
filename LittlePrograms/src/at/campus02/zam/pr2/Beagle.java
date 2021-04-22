package at.campus02.zam.pr2;

public class Beagle extends Dog{
    public String lovedFood;

    public Beagle(String lF){
        lovedFood = lF;
    }

    public void jump(int height){
        System.out.println("Beagle jumps " + height + " cm high");
    }
    @Override
    public String toString() {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
