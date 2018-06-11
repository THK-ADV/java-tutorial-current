package beispiele.ueberladung;

public class Karteikarte {

    private Vokabel vok;
    private int anzahlUebungen;

    public Vokabel getVok() {
        return vok;
    }

    public int getAnzahlUebungen() {
        return anzahlUebungen;
    }

    public void ueben() {
        /* So nicht!
        anzahlUebungen++;
        System.out.println("Die Karteikarte wurde 1 mal geübt");
        */

        // Diese Funktionalität wurde bereits in der Überladung dieser Methode implementiert,
        // die einen int als Parameter annimmt. Lieber diese bereits bestehende Methode aufrufen.
        // So müssen Änderungen und Fehler nur an einem einzigen Ort korrigiert werden.
        ueben(1);
    }

    public void fuenfMalUeben() {
        /* So nicht!
        anzahlUebungen += 5;
        System.out.println("Die Karteikarte wurde 5 mal geübt");
        */

        // Diese Funktionalität wurde bereits in der Methode implementiert,
        // die einen int als Parameter annimmt. Lieber diese bereits bestehende Methode aufrufen.
        // So müssen Änderungen und Fehler nur an einem einzigen Ort korrigiert werden.
        ueben(5);
    }

    public void ueben(int anzahl) {
        anzahlUebungen += anzahl;
        System.out.println("Die Karteikarte wurde " + anzahl + " mal geübt");
    }


}
