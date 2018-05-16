package exkurs.dates.beispiele;

import exkurs.dates.BeispielMethoden;

import java.time.LocalDateTime;

public class LocalDateTimeBeispiel implements BeispielMethoden {

    private LocalDateTime localDateTime;

    public LocalDateTimeBeispiel(int jahr, int monat, int tag, int stunde, int minute, int sekunde) {
        localDateTime = LocalDateTime.of(jahr, monat, tag, stunde, minute, sekunde);
    }

    @Override
    public int getTag() {
        return localDateTime.getDayOfMonth();
    }

    @Override
    public int getJahr() {
        return localDateTime.getYear();
    }

    @Override
    public int getMonat() {
        return localDateTime.getMonthValue();
    }

    @Override
    public int getStunde() {
        return localDateTime.getHour();
    }

    @Override
    public int getMinute() {
        return localDateTime.getMinute();
    }

    @Override
    public int getSekunde() {
        return localDateTime.getSecond();
    }

    @Override
    public String getDateString() {
        return localDateTime.toString();
    }
}
