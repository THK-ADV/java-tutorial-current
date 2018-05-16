package exkurs.dates.beispiele;

import exkurs.dates.BeispielMethoden;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarBeispiel implements BeispielMethoden {

    private Calendar calendar;

    public CalendarBeispiel(int jahr, int monat, int tag, int stunde, int minute, int sekunde) {
        calendar = new GregorianCalendar(jahr, monat, tag, stunde, minute, sekunde);
    }

    @Override
    public int getTag() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int getJahr() {
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public int getMonat() {
        return calendar.get(Calendar.MONTH);
    }

    @Override
    public int getStunde() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    @Override
    public int getMinute() {
        return calendar.get(Calendar.MINUTE);
    }

    @Override
    public int getSekunde() {
        return calendar.get(Calendar.SECOND);
    }

    @Override
    public String getDateString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(calendar.getTime());
    }
}
