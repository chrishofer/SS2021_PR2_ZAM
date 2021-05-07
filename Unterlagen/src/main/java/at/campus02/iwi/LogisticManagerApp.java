package at.campus02.iwi;

public class LogisticManagerApp {
    public static void main(String[] args) {
        LogisticManager l = new LogisticManager();

        l.addMovable(new Shirt("Mike", "S", "red"));
        l.addMovable(new Car("Kleinwagen", "brown", 1500));
        l.addMovable(new Shirt("Badidas", "M", "yellow"));


        l.moveAll("San Pedro");

    }
}