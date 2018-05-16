package beispiele.dates;

import beispiele.dates.beispiele.CalendarBeispiel;
import beispiele.dates.beispiele.DateBeispiel;
import beispiele.dates.beispiele.LocalDateTimeBeispiel;

public class DateTest {

    public static void main(String[] args) {

        DatePrinter printer = new DatePrinter();

        CalendarBeispiel calendarBeispiel
                = new CalendarBeispiel(2018, 5,16,7,39, 20);
        LocalDateTimeBeispiel localDateTimeBeispiel
                = new LocalDateTimeBeispiel(2018, 5,16,7,39, 20);
        DateBeispiel dateBeispiel
                = new DateBeispiel(2018, 5,16,7,39, 20);

        printer.print(calendarBeispiel);
        printer.print(localDateTimeBeispiel);
        printer.print(dateBeispiel);

    }

}
