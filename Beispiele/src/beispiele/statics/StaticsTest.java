package beispiele.statics;

public class StaticsTest {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Polo", 150);
        Auto auto2 = new Auto("Golf", 200);

        Auto schnelleresAuto = Auto.getSchnelleres(auto1, auto2);
        boolean auto1IstSchneller = auto1.istSchnellerAls(auto2);
        boolean auto2IstSchneller = auto2.istSchnellerAls(auto1);

        System.out.println("Auto 1 ist schneller " + auto1IstSchneller);
        System.out.println("Auto 2 ist schneller " + auto2IstSchneller);
        System.out.println("Das schnellere Auto heißt " + schnelleresAuto.name);

    }

}
