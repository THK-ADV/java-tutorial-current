package beispiele.innerclass;

/**
 * Diese Klasse ist eine sogenannte rekursive Datenstruktur.
 * Das bedeutet, das ein Objekt vom Typ {@link Matrjoschka}
 * wiederum Objekte des Typs Matrjoschka enthält.
 * <p>
 * Dies wird dadurch erreicht, dass eines der Felder der Klasse (das Feld "innerePuppe")
 * den Typ der eigenen Klasse hat, also ein Objekt desselben Typs referenzieren kann.
 */
public class Matrjoschka {

    private double groesse;
    private String farbe;

    private Matrjoschka innerePuppe;

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public Matrjoschka getInnerePuppe() {
        return innerePuppe;
    }

    public void setInnerePuppe(Matrjoschka innerePuppe) {
        this.innerePuppe = innerePuppe;
    }

    public Matrjoschka(double groesse, String farbe, Matrjoschka innerePuppe) {

        this.groesse = groesse;
        this.farbe = farbe;
        this.innerePuppe = innerePuppe;
    }
}
