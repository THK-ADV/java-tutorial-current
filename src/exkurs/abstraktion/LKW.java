package exkurs.abstraktion;

public class LKW extends Fahrzeug {

    private String ladungstyp;
    private boolean kuehlung;

    @Override
    public void hupen() {
        System.out.println("Lautes HUP HUP");
    }

    public void mautBezahlen(double mautGebuehr) {
        System.out.println("Eine Maut von "+ mautGebuehr + " wurde bezahlt.");
    }

    @Override
    public void reifenWechseln(){
        System.out.println(getAnzahlReifen());
    }

}
