package beispiele.ueberladung;

public class Vokabel {

    private String englisch;
    private String deutsch;

    public Vokabel(String englisch, String deutsch) {
        this.englisch = englisch;
        this.deutsch = deutsch;
    }

    public String getDeutsch() {
        return deutsch;
    }

    public String getEnglisch() {
        return englisch;
    }
}
