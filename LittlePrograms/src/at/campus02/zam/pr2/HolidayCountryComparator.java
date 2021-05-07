package at.campus02.zam.pr2;

import java.util.Comparator;

public class HolidayCountryComparator implements Comparator<Holiday> {
    @Override
    public int compare(Holiday o1, Holiday o2) {
        return o1.getDestination().compareTo(o2.getDestination());
    }
}
