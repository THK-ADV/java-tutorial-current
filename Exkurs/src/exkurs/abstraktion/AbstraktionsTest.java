package exkurs.abstraktion;

public class AbstraktionsTest {

    public static void main(String[] args) {

        PKW pkw1 = new PKW();
        pkw1.fahren(20);

        // Falsch!! PKW pkw2 = new Fahrzeug();
        Fahrzeug pkw3 = new PKW();
        pkw3 = new LKW();
        // Geht nicht! pkw3.kofferraumBeladen("Koffer");

        Fahrzeug fahrzeug1 = new PKW();
        Fahrzeug fahrzeug2 = new LKW();

        fahrzeug1.hupen();
        fahrzeug2.hupen();

        fahrzeug1.reifenWechseln();
        fahrzeug2.reifenWechseln();

    }

}
