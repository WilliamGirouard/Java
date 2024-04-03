import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        parcourirListIterator();
    }
    public static void parcourirListIterator() {
        ArrayList<String> uneListe = new ArrayList<>();
        uneListe.add("un");
        uneListe.add("deux");
        uneListe.add("trois");
        uneListe.clear();
        System.out.println(uneListe.isEmpty());
    }
}