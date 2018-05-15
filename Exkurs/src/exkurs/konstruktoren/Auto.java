package exkurs.konstruktoren;

public class Auto {

    private int geschwindigkeit;
    private int kilometerstand;

    public Auto(int geschwindigkeit, int kilometerstand) {
        this.geschwindigkeit = geschwindigkeit;
        this.kilometerstand = kilometerstand;
        System.out.println("Konstruktor 1 wurde aufgerufen");
    }

    //Konstruktorüberladung
    public Auto(int geschwindigkeit) {
        this(geschwindigkeit, 0);
        System.out.println("Konstruktor 2 wurde aufgerufen");

    }

    public Auto() {
        this(0);
        System.out.println("Konstruktor 3 wurde aufgerufen");
    }

}
