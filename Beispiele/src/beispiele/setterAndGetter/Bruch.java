package beispiele.setterAndGetter;

public class Bruch {

    private double zaehler;
    private double nenner;

    public Bruch() {
        this(1,1);
    }

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public double getZaehler() {
        return zaehler;
    }

    public void setZaehler(double zaehler) {
        this.zaehler = zaehler;
    }

    public double getNenner() {
        return nenner;
    }

    public void setNenner(double nenner) {
        if (nenner == 0) throw new RuntimeException("Nenner darf nicht 0 sein");
        this.nenner = nenner;
    }

    //Getter ohne Variable
    public double getDezimal() {
        return zaehler / nenner;
    }
}