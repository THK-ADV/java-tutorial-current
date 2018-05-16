package beispiele.interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfacesTest {

    public static void main(String[] args) {

        //Sonne dieSonne = new Sonne();
        //Smartphone meinSmartphone = new Smartphone();
        //Gluehbirne birne = new Gluehbirne();
        //dieSonne.leuchten();
        //meinSmartphone.leuchten();
        //birne.leuchten();

        KannLeuchten irgendwasWasLeuchtenKann = new Gluehbirne();
        //irgendwasWasLeuchtenKann.leuchten();
        //irgendwasWasLeuchtenKann.wechseln(); -> geht nicht

        List<KannLeuchten> leuchtListe = new ArrayList<KannLeuchten>();
        leuchtListe.add(new Gluehbirne());
        leuchtListe.add(new Sonne());
        leuchtListe.add(new Smartphone());

        for (KannLeuchten einzelnesLeuchtding: leuchtListe) {
            einzelnesLeuchtding.leuchten();
            //einzelnesLeuchtding.wechseln(); -> geht nicht
        }
    }

}
