public class Adresse {
    private String strasse, plz, ort;
    private int hausnummer;

    public Adresse(String strasse, int hausnummer, String plz, String ort) {
        this.strasse = strasse;
        this.plz = plz;
        this.hausnummer = hausnummer;
        this.ort = ort;
    }


    public String getStrasse() {
        return this.strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return this.plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
