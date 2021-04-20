package at.campus02.zam.pr2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> namesForLuckyDraw = new ArrayList<String>(50);
        // for a double arraylist i have to write ArrayList<Double>
        // add elements to end of arraylist
        namesForLuckyDraw.add("Relindis");
        namesForLuckyDraw.add("Luisa");
        namesForLuckyDraw.add("Stefanie");
        namesForLuckyDraw.add("Julia");

        // how many element in arraylist
        System.out.println(namesForLuckyDraw.size());

        // get element from arraylist
        System.out.println(namesForLuckyDraw.get(0));

        // remove element from arraylist (the second element)
        namesForLuckyDraw.remove(1);
        System.out.println(namesForLuckyDraw.get(1));

        // is element in there?
        System.out.println(namesForLuckyDraw.contains("Julia"));

        // how to iterate over it - possibility 1 for loop
        for(int i = 0; i < namesForLuckyDraw.size(); ++i)
        {
            System.out.println(namesForLuckyDraw.get(i));
        }

        // how to iterate over it - possibility 2 for each loop
        for(String s : namesForLuckyDraw){
            System.out.println(s);
        }
        System.out.println("*****");
        // hot to iterate over it - possibility 3 iterator
        Iterator<String> it = namesForLuckyDraw.iterator();
        while(it.hasNext()){
            String elem = it.next(); // next element
            System.out.println(elem);
        }
        System.out.println("*****");

        System.out.println("--------------------");

        // now to linkedlist
        // create a linked list with the content of the arraylist
        LinkedList<String> winner = new LinkedList<>(namesForLuckyDraw);

        System.out.println(winner.getFirst());
        System.out.println(winner.getLast());

        // iterate over it (not that fast)
        for(int i = 0; i < winner.size(); ++i ){
            System.out.println(winner.get(i)); // i think this will be slow
        }

        // better to do the for reach
        for(String w : winner){
            System.out.println(w);
        }

        // iterate over it
        Iterator<String> lIt = winner.iterator();
        while(lIt.hasNext()){
            System.out.println(lIt.next());
        }

    }
}
