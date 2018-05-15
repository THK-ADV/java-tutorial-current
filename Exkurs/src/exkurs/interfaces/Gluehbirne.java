package exkurs.interfaces;

public class Gluehbirne implements KannLeuchten{

    @Override
    public void leuchten(){
        System.out.println("Leuchtdraht glüht.");
    }
    public void wechseln(){
        System.out.println("Glühbirne wird gewechselt.");
    }

}
