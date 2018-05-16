package exkurs.interfaces;

public class Smartphone implements KannLeuchten{

    @Override
    public void leuchten(){
        System.out.println("LED leuchtet.");
    }
}
