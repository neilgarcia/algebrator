
public class Wyrazenie {
    private Funkcjonal funkcjonal;

    Wyrazenie() {
    }
    Wyrazenie(String dane) {
        funkcjonal = konwersja(dane);
    }

    private Funkcjonal konwersja(String dane) {
        return new Funkcjonal();
    }

    public String wykonaj() {
        return "";
    }

}
