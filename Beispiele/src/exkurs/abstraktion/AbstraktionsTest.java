package exkurs.abstraktion;

public class AbstraktionsTest {

    public static void main(String[] args) {

        PKW pkw1 = new PKW(
                "Blau",
                29.999,
                250,
                4,
                0,
                200
        );
        pkw1.fahren(20);

        // Falsch!! PKW pkw2 = new Fahrzeug();
        Fahrzeug pkw3 = new PKW(
                "Rot",
                39.999,
                300,
                4,
                10,
                100
        );
        pkw3 = new LKW(
                "Silber",
                69.999,
                120,
                16,
                3000,
                "Schotter",
                false
        );
        // Geht nicht! pkw3.kofferraumBeladen("Koffer");

        Fahrzeug fahrzeug1 = new PKW(
                "Lila",
                19.999,
                150,
                4,
                19,
                200
        );
        Fahrzeug fahrzeug2 = new LKW(
                "Rot",
                79.999,
                140,
                12,
                1000,
                "Lebensmittel",
                true
        );

        fahrzeug1.hupen();
        fahrzeug2.hupen();

        fahrzeug1.reifenWechseln();
        fahrzeug2.reifenWechseln();

    }

}
