package beispiele.innerclass;

public class VerketteteListe {
    private Knoten head;

    public VerketteteListe(String inhalt) {
        this.head = new Knoten(inhalt, null);
    }

    public Knoten getHead() {
        return head;
    }

    public void setHead(Knoten head) {
        this.head = head;
    }

    public void add (String inhalt){
        Knoten neuerKnoten = new Knoten(inhalt, head);
        head = neuerKnoten;
    }

    public void addLast (String inhalt) {

        if (isEmpty())
            add(inhalt);

        Knoten tmp = head;

        for (int i = 0; i < getSize() - 1; i++) {
            tmp = tmp.naechster;
        }

        tmp.naechster = new Knoten(inhalt, null);
    }

    public Knoten get(int index){

        Knoten tmp = head;

        for (int i = 0; i < index; i++) {
            tmp = tmp.getNaechster();
        }

        return tmp;
    }

    public int getSize() {
        if (isEmpty())
            return 0;

        Knoten tmp = head;
        int count = 1;

        while (tmp.naechster != null) {
            count++;
            tmp = tmp.naechster;
        }

        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public static class Knoten{
        private String inhalt;
        private Knoten naechster;

        public Knoten(String inhalt, Knoten naechster) {
            this.inhalt = inhalt;
            this.naechster = naechster;
        }

        public String getInhalt() {
            return inhalt;
        }

        public void setInhalt(String inhalt) {
            this.inhalt = inhalt;
        }

        public Knoten getNaechster() {
            return naechster;
        }

        public void setNaechster(Knoten naechster) {
            this.naechster = naechster;
        }
    }

}
