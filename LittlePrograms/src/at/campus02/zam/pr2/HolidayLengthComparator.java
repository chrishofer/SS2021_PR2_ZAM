package at.campus02.zam.pr2;

import java.util.Comparator;

public class HolidayLengthComparator implements Comparator<Holiday> {
    @Override
    public int compare(Holiday o1, Holiday o2) {
        return Integer.compare(o1.getLengthInDays(), o2.getLengthInDays());
    }
}
