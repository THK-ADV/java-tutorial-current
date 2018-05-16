package beispiele.interfaces;

public class Sonne implements KannLeuchten{

    @Override
    public void leuchten() {
        System.out.println("Sonne macht Kernfusion.");
    }
}
