package beispiele.innerclass;

public class InnerClassTest {
    public static void main(String[] args) {

        Matrjoschka mat1 = new Matrjoschka(12.0, "blau", null);
        Matrjoschka mat2 = new Matrjoschka(14.0, "rot", mat1);

        System.out.println("Dies ist die äußere Puppe. Sie hat eine Größe von " +
                mat2.getGroesse() +
                " und ist " +
                mat2.getFarbe());
        System.out.println("Dies ist die innere Puppe. Sie hat eine Größe von " +
                mat2.getInnerePuppe().getGroesse() +
                " und ist " +
                mat2.getInnerePuppe().getFarbe());

        /**
         * Gäbe es noch eine innere Puppe, sähe die Abfrage der Farbe so aus:
         */
//        String farbe = mat2.getInnerePuppe().getInnerePuppe().getFarbe();
        /**
         * Da jedoch nur zwei Puppen verschachtelt wurden, würde das zu einem Fehler führen:
         * einer NullPointerException
         */

    }
}
