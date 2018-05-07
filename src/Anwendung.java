import data.Adresse;

public class Anwendung {

    /**
     * Einstiegspunkt des Programms
     * @param args Argumente die beim Start des Programms übergeben werden können
     */
    public static void main(String[] args) {
        Adresse adresse1 = new Adresse("Martin-Straße", 5, "51641", "Gummersbach");
        Adresse adresse2 = new Adresse("Steinmüllerallee", 1, "51641", "Gummersbach");


        System.out.println(Adresse.istGleicherOrt(adresse1, adresse2));
        System.out.println(adresse1.getBriefkopf());
        System.out.println(adresse2.getBriefkopf());
    }

}
