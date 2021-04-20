package at.campus02.zam.pr2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {
    public static void main(String[] args) {
        HashSet<String> winner = new HashSet<>();

        winner.add("Heidemarie");
        winner.add("Mirjam");
        winner.add("Paulina");
        winner.add("Magdalena");

        for(String w: winner){
            System.out.println(w);
        }
        // will not work
        System.out.println(winner.add("Magdalena"));
        for(String w: winner){
            System.out.println(w);
        }
        // we can alse use iterator
        Iterator<String> it = winner.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        // Hashmap saving zip code + city name
        // zip code should be the key - i  can use it to find city names very fast
        HashMap<Integer, String> zipCity = new HashMap<>();

        // add values with put function
        zipCity.put(8010, "Graz");
        zipCity.put(1010, "Wien");
        zipCity.put(9010, "Klagenfurt");
        zipCity.put(1010, "Wien Innenstadt");
        // access the value with the key
        System.out.println(zipCity.get(1010));

        // is it in hashmap?
        System.out.println(zipCity.containsKey(1010));

        // remove a key value pair
        zipCity.remove(9010);
        // iterative over keys in for each
        for(Integer zip : zipCity.keySet()){
            System.out.println("Key:" + zip + " Value:" + zipCity.get(zip));
        }

    }
}
