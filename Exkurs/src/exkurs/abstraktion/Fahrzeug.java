package exkurs.abstraktion;

public abstract class Fahrzeug {

    protected String farbe;
    protected double preis;
    protected int geschwindigkeit;
    private int anzahlReifen;
    private int kilometerstand;

    public void fahren(int kilometer) {
        kilometerstand += kilometer;
        System.out.println("Rööööm " + kilometer + "km gefahren!");
    }

    public abstract void hupen();

    public void reifenWechseln(){
        System.out.println(anzahlReifen + " Reifen wurden gewechselt");
    }

    public int getAnzahlReifen() {
        return anzahlReifen;
    }

    public void setAnzahlReifen(int anzahlReifen) {
        this.anzahlReifen = anzahlReifen;
    }


}
