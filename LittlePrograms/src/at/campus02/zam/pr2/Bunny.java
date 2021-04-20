package at.campus02.zam.pr2;

public class Bunny {
    private String name;
    private String favoriteFood;
    private int bID;
    private static int bunnyID = 1000;
    private Season birthSeason;

    // if we write at least one constructor
    // the default constructor no longer exists

    // now we wrote a constructor without parameter (we would not have to change anything)
    //public Bunny(){
    //    favoriteFood = "carrots";
    //}

    //because we defined a constructor with one parameter
    //we no longer have the default constructor without parameters
    // see the problems
    public Bunny(String name){
        this.name = name;
        this.favoriteFood = "carrots";
        this.bID = bunnyID;
        bunnyID += 1000;
        birthSeason = Season.SUMMER;
    }
    public Bunny(String name, String favoriteFood, Season s){
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.bID = bunnyID;
        this.birthSeason = s;
        bunnyID += 1000;
    }

    public static int getNextBunnyID(){
        //this.bID does not work because this is an instance attribut
        return bunnyID;
    }

    public int getbID(){
        return bID;
    }
    // output name and favoritefood of bunny
    // we just want to use it internally therefore private
    private void output(){
        System.out.println(name + " " + favoriteFood);
        if(birthSeason == Season.SUMMER){
            System.out.println("Summer Child");
        }
    }

    // getter for private String name
    public String getName(){
        return name;
    }
    // setter for private String name
    public void setName(String name){
        // no null values
        if (name != null){
            this.name = name;
            output();
        }
    }
    // getter for favoriteFood
    public String getFavoriteFood(){
        return favoriteFood;
    }

    // setter for favoriteFood
    public void setFavoriteFood(String fav){
        this.favoriteFood = fav;
    }
    // this is the same thing
    public void changeFavoriteFood(String favoriteFood){

        this.favoriteFood = favoriteFood;
    }
    public void changeFavoriteFood(){
        favoriteFood = "carrots";
    }

    @Override
    public String toString() {
        return "Bunny: " + name + " loves " + favoriteFood;
    }
}
