package beispiele.innerclass;

/**
 * Diese Klasse beinhaltet eine innere Klasse. Sie soll ein Regal darstellen (die äußere Klasse {@link Regal}),
 * deren Schubladen einzeln angesprochen werden können (dargestellt durch die innere Klasse {@link Schublade}.
 *
 * Diese Schubladen können dann jeweils einen Gegenstand (hier repräsentiert durch einen String) enthalten.
 */
public class Regal {

    private Schublade lade1;
    private Schublade lade2;
    private Schublade lade3;
    private Schublade lade4;

    public String getLade1() {
        return lade1.inhalt;
    }

    public double getGroesseLade1() {
        return lade1.groesse;
    }

    public String getLade2() {
        return lade2.inhalt;
    }

    public double getGroesseLade2() {
        return lade2.groesse;
    }
    public String getLade3() {
        return lade3.inhalt;
    }

    public double getGroesseLade3() {
        return lade3.groesse;
    }
    public String getLade4() {
        return lade4.inhalt;
    }

    public double getGroesseLade4() {
        return lade4.groesse;
    }

    /**
     * Dies ist die innere Klasse
     */
    private class Schublade{
        private String inhalt;
        private double groesse;
    }


}
