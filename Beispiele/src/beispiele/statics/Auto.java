package beispiele.statics;

public class Auto {

    public int hoechstgeschwindigkeit;
    public String name;

    public Auto(String name) {
        this(name, 0);
    }

    public Auto(String name, int hoechstgeschwindigkeit) {
        this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
        this.name = name;
    }

    /**
     * Für diese Methode ist es nicht nötig ein Objekt vom Typ Auto zu erstellen.
     * Sie vergleicht zwei Autos miteinander und gibt das schnellere Auto zurück.
     *
     * Der Aufruf erfolt über die Klasse
     * Auto a = new Auto();
     * Auto b = new Auto();
     *
     * Auto schnelleresAuto = Auto.getSchnelleres(a,b);
     *
     * @param auto1 Auto 1 des Vergleichs
     * @param auto2 Auto 2 des Vergleichs
     * @return Das schnellere Auto
     */
    public static Auto getSchnelleres(Auto auto1, Auto auto2) {
        if(auto1.hoechstgeschwindigkeit > auto2.hoechstgeschwindigkeit) return auto1;
        else return auto2;
    }

    /**
     * Diese Methode bezieht sich auf ein bestimmtes Objekt vom Typ Auto.
     * Der Aufruf erfolt über das Objekt:
     *
     * Auto a = new Auto();
     * Auto b = new Auto();
     * boolean autoAIstSchneller = a.istSchnellerAls(b);
     *
     * @param auto Das Auto mit dem das aktuelle Objekt verglichen werden soll.
     * @return true wenn das aktuelle Auto schneller ist als das übergebene Auto.
     */
    public boolean istSchnellerAls(Auto auto) {
        return this.hoechstgeschwindigkeit > auto.hoechstgeschwindigkeit;
    }
}
