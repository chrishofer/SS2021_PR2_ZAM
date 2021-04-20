package at.campus02.zam.pr2;

public class BunnyApp {
    public static void main(String[] args) {
        Bunny bugs = new Bunny("Bugs", "Choc. Carrots", Season.SUMMER);
        Bunny roger = new Bunny("Roger");

        //bugs.changeFavoriteFood();
//        System.out.println(bugs.getFavoriteFood());
//        bugs.setFavoriteFood("ananas cake");
//        System.out.println(bugs.getFavoriteFood());
//        bugs.changeFavoriteFood("chocolate carrots");
//        //System.out.println(bugs.favoriteFood);
        bugs.setName("Bugs");

        // test array with bunnies
        Bunny [] bunnies = new Bunny[12];

        bunnies[0] = bugs;
        bunnies[1] = roger;


        for(int i = 0; i < bunnies.length; ++i)
        {
            // because our array is not full
            if(bunnies[i] != null){
                System.out.println(bunnies[i]);//.getFavoriteFood());
            }
        }
        // call instance method
        System.out.println(roger.getbID());
        // call class method
        System.out.println(Bunny.getNextBunnyID());


        String x;
        // crash course ? : operator -
        // condition ? excecute if true : execute if false
        // 27 < 42 ? "yes" : "no"
        x = 27 < 42 ? "yes" : "no";
        System.out.println(x);
        // short notation for
        if(27 < 42){
            x = "yes";
        }else{
            x = "no";
        }

    }
}
