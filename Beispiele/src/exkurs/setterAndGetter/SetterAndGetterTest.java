package exkurs.setterAndGetter;

public class SetterAndGetterTest {

    public static void main(String[] args) {
        Bruch bruch = new Bruch();
        bruch.setNenner(5);
        bruch.setZaehler(4);
        System.out.println(bruch.getZaehler());
        System.out.println("---");
        System.out.println(bruch.getNenner());
        System.out.println("=");
        System.out.println(bruch.getDezimal());
    }

}
