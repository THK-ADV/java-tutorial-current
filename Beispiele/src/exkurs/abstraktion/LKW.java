package exkurs.abstraktion;

public class LKW extends Fahrzeug {

    private String ladungstyp;
    private boolean kuehlung;

    public LKW(String farbe, double preis, int geschwindigkeit, int anzahlReifen, int kilometerstand, String ladungstyp, boolean kuehlung) {
        super(farbe, preis, geschwindigkeit, anzahlReifen, kilometerstand);
        this.ladungstyp = ladungstyp;
        this. kuehlung = kuehlung;
    }

    @Override
    public void hupen() {
        System.out.println("Lautes HUP HUP");
    }

    public void mautBezahlen(double mautGebuehr) {
        System.out.println("Eine Maut von "+ mautGebuehr + " wurde bezahlt.");
    }

}
