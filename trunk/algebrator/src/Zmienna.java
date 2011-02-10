
public class Zmienna extends Term {
    private int wartosc;
    Zmienna (int wartosc){
        super(new Integer(wartosc).toString());
        this.wartosc=wartosc;
    }
}
