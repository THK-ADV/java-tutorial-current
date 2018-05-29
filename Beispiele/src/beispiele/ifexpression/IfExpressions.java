package beispiele.ifexpression;

public class IfExpressions {
    public static void main(String[] args) {

        boolean imTrue = true;
        //Nur ein Beispiel. imTrue könnte durch eine komplizierte Auswertung ermittelt werden.



        /*So nicht!
        if (imTrue == true) { ... }
        */

        // Ein Wert vom Typ Boolen braucht in einer If-Anweisung nicht mit true oder false verglichen werden.
        // Stattdessen kann er selbst als Bedingung verwendet werden.
        // Lieber so:
        if (imTrue) {
            System.out.println("Ist wahr.");
        } else {
            System.out.println("Ist falsch.");
        }

        // Soll der boolsche Wert false sein, kann die logische Verneinung mit dem "!"-Symbol verwendet werden.
        // Das sieht dann so aus:
        /*
        if (!imTrue) {...}
         */
    }



    //Rückgabe von boolschen Werten
    public boolean istStringGroeßer(String text1, String text2) {

        /*So nicht!
        if(text1.length() > text2.length()) {
            return true;
        } else {
            return false;
        }
        */

        // Statt den Vergleich in die Bedingung einer If-Anweisung zu schreiben
        // und diese dann true oder false zurückgeben zu lassen,
        // kann der Vergleich selbst als Rückgabewert verwendet werden,
        // da hier ja bereits ein boolean evaluiert wird. Also so:
        return text1.length() > text2.length();

        // Soll die logisch gegenteilige Aussage getroffen werden, kann auch hier das "!"-Symbol helfen.
        // Hierbei müssen allerdings noch Klammern um den Vergleich gesetzt werden.
        // Das sähe dann so aus:
        /*
        return !(text1.length() > text2.length());
         */
    }
}
