package exkurs.abstraktion;

public class PKW extends Fahrzeug {

    private int kofferraumVolumen;

    public void kofferraumBeladen(String ladung) {
        System.out.println(ladung + " in den Kofferraum geladen");
    }

    @Override
    public void hupen() {
        System.out.println("Leises HUP HUP");
    }
}
