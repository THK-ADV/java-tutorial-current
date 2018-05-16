package exkurs.dates;

public class DatePrinter {

    public void print(BeispielMethoden date){
        System.out.println("=============================");
        System.out.println("Klasse: " + date.getClass().getSimpleName());
        System.out.println("-----------------------------");

        System.out.println("Date: " + date.getDateString());
        System.out.println("Jahr: " + date.getJahr());
        System.out.println("Monat: " + date.getMonat());
        System.out.println("Tag: " + date.getTag());
        System.out.println("Stunde: " + date.getStunde());
        System.out.println("Minute: " + date.getMinute());
        System.out.println("Sekunde: " + date.getSekunde());
        System.out.println("=============================");
        System.out.println();

    }

}
