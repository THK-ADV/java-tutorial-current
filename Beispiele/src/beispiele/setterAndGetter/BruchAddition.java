package beispiele.setterAndGetter;

import java.util.List;

public class BruchAddition {

    List<Bruch> brueche;

    public BruchAddition(List<Bruch> brueche) {
        this.brueche = brueche;
    }

    public double getErgebnis() {
        double summe = 0;
        for (Bruch bruch :
                brueche) {
            /*So nicht!
            summe += bruch.getZaehler() / bruch.getNenner();
            */

            // Das Berechnen des Wertes sollte vom Bruch selbst übernommen werden
            // und ist NICHT die Aufgabe DIESER Klasse.
            // Lieber so:
            summe += bruch.getDezimal();
        }
        return summe;
    }
}
