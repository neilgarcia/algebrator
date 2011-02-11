
import java.util.LinkedList;


public class Wyrazenie {
    private Funkcjonal funkcjonal;

    Wyrazenie() {
    }
    Wyrazenie(String dane) {
        funkcjonal = konwersja(dane);
    }

    public static void ONP(String wejscie)
    {
//        LinkedList <String> nazwas=new LinkedList <String> ();
//        nazwas.push("ala");
//        nazwas.push("kamil");
//        for(String i : nazwas)
//        {
//            System.out.println(i);
//        }






    }

    private Funkcjonal konwersja(String dane) {
        return new Funkcjonal();
    }

    public static void main(String[] args) {
        ONP("(2+3)*5");
    }

    public String wykonaj() {

        return "";
    }

}
