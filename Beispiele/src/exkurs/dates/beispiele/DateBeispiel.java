package exkurs.dates.beispiele;

import exkurs.dates.BeispielMethoden;

import java.util.Date;

/**
 * Die Klasse Date ist deprecated sollte deshalb nichtmehr verwendet werden
 */
public class DateBeispiel implements BeispielMethoden {

    private Date date;

    public DateBeispiel(int jahr, int monat, int tag, int stunde, int minute, int sekunde) {
        date = new Date(jahr, monat, tag, stunde, minute, sekunde);
    }


    @Override
    public int getTag() {
        return date.getDate();
    }

    @Override
    public int getJahr() {
        return date.getYear();
    }

    @Override
    public int getMonat() {
        return date.getMonth();
    }

    @Override
    public int getStunde() {
        return date.getHours();
    }

    @Override
    public int getMinute() {
        return date.getMinutes();
    }

    @Override
    public int getSekunde() {
        return date.getSeconds();
    }

    @Override
    public String getDateString() {
        return date.toGMTString();
    }
}
