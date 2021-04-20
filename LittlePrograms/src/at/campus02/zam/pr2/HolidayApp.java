package at.campus02.zam.pr2;

public class HolidayApp {
    public static void main(String[] args) {
        Holiday summerHoliday = new Holiday("Österreich", 7, 4);
        Holiday winterHoliday = new Holiday("Österreich", 2, 4);

        Holiday defaultHoliday = new Holiday(); // now the constructor withour parameters is called
        summerHoliday.setNrPersons(3);
        System.out.println(summerHoliday.getNrPersons());
        System.out.println(summerHoliday);
    }
}
