
public class Liczba extends Term {
private int wartosc;

    Liczba (int wartosc) {
        super(new Integer(wartosc).toString());
        this.wartosc = wartosc;
    }
}

