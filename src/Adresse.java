/**
 * Klasse Adresse mit den wesentlichen Eigenschaften einer Adresse
 */
public class Adresse {
    /**
     * Eigenschaften der Klasse
     */
    private String strasse, plz, ort;
    private int hausnummer;

    /**
     * Konstruktor der Klasse Adresse
     * Hier werden alle Eigenschaften gesetzt, die für das korrekte Konstruieren eines Objekts der Klasse
     * benötigt werden
     *
     * @param strasse Straße, die der Adresse zugeordnet werden soll
     * @param hausnummer Hausnummer, die der Adresse zugeordnet werden soll
     * @param plz Postleitzahl, des Ort, der der Adresse zugeordnet werden soll
     * @param ort Ort, der der Adresse zugeordnet werden soll
     */
    public Adresse(String strasse, int hausnummer, String plz, String ort) {
        this.strasse = strasse;
        this.plz = plz;
        this.hausnummer = hausnummer;
        this.ort = ort;
    }

    /**
     * Methode zum abfragen der Adresse, die der Adresse zugeordnet wurde
     * @return Straße der Adresse
     */
    public String getStrasse() {
        return this.strasse;
    }

    /**
     * Methode zum setzen der Adresse
     * @param strasse Straße, die der Adresse zugeordnet werden soll
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * Methode zum abfragen der Postleitzahl, die der Adresse zugeordnet wurde
     * @return Postleitzahl der Adresse
     */
    public String getPlz() {
        return this.plz;
    }

    /**
     * Methode zum setzen der Postleitzahl
     * @param plz Postleitzahl, die der Adresse zugeordnet werden soll
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     * Methode zum abfragen der Hausnummer, die der Adresse zugeordnet wurde
     * @return Hausnummer der Adresse
     */
    public int getHausnummer() {
        return hausnummer;
    }

    /**
     * Methode zum setzen der Hausnummer
     * @param hausnummer Hausnummer, die der Adresse zugeordnet werden soll
     */
    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    /**
     * Methode zum abfragen des Ortes, der der Adresse zugeordnet wurde
     * @return Ort der Adresse
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Methode zum setzen des Ortes, der der Adresse zugeordnet werden soll
     * @param ort Ort, der der Adresse zugeordnet werden soll
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }
}
