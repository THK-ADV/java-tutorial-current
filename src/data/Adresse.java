package data;

/**
 * Klasse data.Adresse mit den wesentlichen Eigenschaften einer data.Adresse
 */
public class Adresse {
    /**
     * Eigenschaften der Klasse
     */
    private String strasse, plz, ort;
    private int hausnummer;

    /**
     * Konstruktor der Klasse data.Adresse
     * Hier werden alle Eigenschaften gesetzt, die für das korrekte Konstruieren eines Objekts der Klasse
     * benötigt werden
     *
     * @param strasse Straße, die der data.Adresse zugeordnet werden soll
     * @param hausnummer Hausnummer, die der data.Adresse zugeordnet werden soll
     * @param plz Postleitzahl, des Ort, der der data.Adresse zugeordnet werden soll
     * @param ort Ort, der der data.Adresse zugeordnet werden soll
     */
    public Adresse(String strasse, int hausnummer, String plz, String ort) {
        this.strasse = strasse;
        this.plz = plz;
        this.hausnummer = hausnummer;
        this.ort = ort;
    }

    /**
     * Methode zum abfragen der data.Adresse, die der data.Adresse zugeordnet wurde
     * @return Straße der data.Adresse
     */
    public String getStrasse() {
        return this.strasse;
    }

    /**
     * Methode zum setzen der data.Adresse
     * @param strasse Straße, die der data.Adresse zugeordnet werden soll
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * Methode zum abfragen der Postleitzahl, die der data.Adresse zugeordnet wurde
     * @return Postleitzahl der data.Adresse
     */
    public String getPlz() {
        return this.plz;
    }

    /**
     * Methode zum setzen der Postleitzahl
     * @param plz Postleitzahl, die der data.Adresse zugeordnet werden soll
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     * Methode zum abfragen der Hausnummer, die der data.Adresse zugeordnet wurde
     * @return Hausnummer der data.Adresse
     */
    public int getHausnummer() {
        return hausnummer;
    }

    /**
     * Methode zum setzen der Hausnummer
     * @param hausnummer Hausnummer, die der data.Adresse zugeordnet werden soll
     */
    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    /**
     * Methode zum abfragen des Ortes, der der data.Adresse zugeordnet wurde
     * @return Ort der data.Adresse
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Methode zum setzen des Ortes, der der data.Adresse zugeordnet werden soll
     * @param ort Ort, der der data.Adresse zugeordnet werden soll
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * Vergleicht zwei Adressen miteinander. Hier werden jeweils die orte und die plz verglichen
     * @param adresse1 1. data.Adresse die verglichen werden soll
     * @param adresse2 2. data.Adresse die verglichen werden soll
     * @return True wenn a1.ort gleich a2.ort und a1.plz gleich a2.plz
     */
    public static boolean istGleicherOrt(Adresse adresse1, Adresse adresse2) {
        return adresse1.ort.equals(adresse2.ort) && adresse1.plz.equals(adresse2.plz);


        //return adresse1.ort.equals(adresse2.ort)
          //      && adresse1.plz.equals(adresse2.plz);
    }

    /**
     * Gibt alle wesentlichen Informationen der data.Adresse als String aus, in der Form eines Briefkopfes.
     * @return Briefkopf als String
     */
    public String getBriefkopf(){
        return strasse + " " + hausnummer + ", " + plz + " " + ort;
    }
}
