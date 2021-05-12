package at.campus02.zam.pr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        double []darr  = {7.2, 2.4, 100001.4, 3.8, 0.2, 0.0003};

        // fast way to print array
        System.out.println(Arrays.toString(darr));

        // 3.0E-4 -> scientific notation  3 * 10 ^-4
        Arrays.sort(darr);
        System.out.println(Arrays.toString(darr));

        // try to do with dogs

        Dog []dogs = {new Dog("green", 2), new Dog("brown", 1),
                      new Dog("blue", 3), new Dog("green", 1)};
        System.out.println(Arrays.toString(dogs));
        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));
        // same thing for lists (arraylist, linkedlist, ...)
        System.out.println("##########");
        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("green", 2));
        dogList.add(new Dog("brown", 1));
        dogList.add(new Dog("blue", 3));
        dogList.add(new Dog("green", 1));
        System.out.println(dogList);
        Collections.sort(dogList); // only difference we use class Collections
        System.out.println(dogList);

        System.out.println("********");
        ArrayList<Holiday> holidays = new ArrayList<>();


        holidays.add(new Holiday("Kuba", 7, 2));
        holidays.add(new Holiday("Karibik", 14, 2));
        holidays.add(new Holiday("Deutschland", 7, 1));
        holidays.add(new Holiday("Deutschland", 6,4));
        holidays.add(new Holiday("Australien", 6, 2));
        System.out.println(holidays);
        //Collections.sort(holidays);
        // instead with comparator
        Collections.sort(holidays, new HolidayCountryComparator());
        System.out.println(holidays);

        Collections.sort(holidays, new HolidayLengthComparator());
        System.out.println(holidays);


        //Arrays.sort


    }
}
