package at.campus02.zam.pr2;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAgain {
    public static void main(String[] args) {

        // hashmap consists out of key and value
        // there are never alone
        // Special Thin is how data is organized
        // there is no order like when did we enter data
        // they are "sorted" according to their keys
        // the keys are the "keys" to access the elements (the value)
        // "navigation helper for data structure"
        // if i know my navigation helper i can find my data (the value)
        // in nearly no time
        // lets compare to  an arraylist: how long does it take us to
        // find a value in there when we don't know the position?
        // ---> worst case: search through whole arraylist
        // advantage: very fast access through the element
        HashMap<String, Integer> hashi = new HashMap<>();

        // usage is a small bit different than arraylist
        // enter new data only in pairs
        // counting something is very typical
        // how often have you laughed today
        hashi.put("Kleinsasser", 5);
        hashi.put("Summer", 0);
        hashi.put("Kofler", 3);

        // i can also just update data
        hashi.put("Kofler", 4);

        // how can i access data in it
        // if i know the key is in there then just specify it
        System.out.println(hashi.get("Summer"));

        // however what happens if it is not in there
        System.out.println(hashi.get("Sumer"));

        // alternative (very useful if we count something)
        System.out.println(hashi.getOrDefault("Sumer", 0));

        // check if a key is in hashmap
        System.out.println(hashi.containsKey("Kleinsasser"));

        // we can iterate over it
        for(String key : hashi.keySet()){
            System.out.println(key + " " + hashi.get(key));
        }

        // test static method
        ArrayList<String> testLaugh = new ArrayList<>();
        testLaugh.add("Safar");
        testLaugh.add("Wild");
        testLaugh.add("Wild");
        testLaugh.add("Weirer");
        testLaugh.add("De Franco");
        testLaugh.add("Chevillotte");
        testLaugh.add("Burila");
        testLaugh.add("Cautin");
        testLaugh.add("Safar");
        testLaugh.add("Safar");
        testLaugh.add("Safar");
        testLaugh.add("De Franco");

        System.out.println(countLaugh(testLaugh));

    }
    // a little example for you
    // write a static method
    // HashMap<String, Integer> countLaugh(ArrayList<String> names)
    // the arraylist contains names of the people laughing
    // names = ["Weirer", "Summer", "Wild", "Weirer", "Safar", ....]
    // Hashmap schould contain how often somebody laughed e.g.
    // "Weirer": 2, "Summer": 1, "Wild": 1, "Safar": 1

    public static HashMap<String, Integer> countLaugh(ArrayList<String> names){
        HashMap<String, Integer> erg = new HashMap<>();

        for(String n : names){
            erg.put(n, erg.getOrDefault(n, 0) + 1);
//            Alternative
            if(erg.containsKey(n)){
                erg.put(n, erg.get(n) + 1);
            }else{
                erg.put(n, 1);
            }
        }

        return erg;
    }

}
