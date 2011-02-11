
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inkwizytor89
 */
public class WyrazenieTest {


    @Test
    public void testPusty() {
        Wyrazenie instance = new Wyrazenie("");
        String expResult = "";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testDodawanie_0 () {
        Wyrazenie instance = new Wyrazenie("1+3");
        String expResult = "4";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testOdejmowanie() {
        Wyrazenie instance = new Wyrazenie("1-3");
        String expResult = "-2";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testMnozenie() {
        Wyrazenie instance = new Wyrazenie("4*2");
        String expResult = "8";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testDzielenie() {
        Wyrazenie instance = new Wyrazenie("6/2");
        String expResult = "3";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testPotegowanie_1() {
        Wyrazenie instance = new Wyrazenie("2^4");
        String expResult = "16";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testPotegowanie_2() {
        Wyrazenie instance = new Wyrazenie("potega(2,4)");
        String expResult = "16";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testPierwiastkowanie() {
        Wyrazenie instance = new Wyrazenie("pierwiastek(3,27)");
        String expResult = "3";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testPodstawoweWyrazenia_1() {
        Wyrazenie instance = new Wyrazenie("3/4");
        String expResult = "3/4";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testPodstawoweWyrazenia_2() {
        Wyrazenie instance = new Wyrazenie("1+2/4");
        String expResult = "1+1/2";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testPodstawoweWyrazenia_3() {
        Wyrazenie instance = new Wyrazenie("pierwiastek(1+1)");
        String expResult = "pierwiastek(2)";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testZmienne_1() {
        Wyrazenie instance = new Wyrazenie("a+b");
        String expResult = "a+b";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testZmienne_2() {
        Wyrazenie instance = new Wyrazenie("a+b+a");
        String expResult = "2a+b";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testZmienne_3() {
        Wyrazenie instance = new Wyrazenie("aba");
        String expResult = "potega(a,2)b";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testZmienne_4() {
        Wyrazenie instance = new Wyrazenie("ab/a");
        String expResult = "b";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testMieszane_1() {
        Wyrazenie instance = new Wyrazenie("(a+1)/a+2");
        String expResult = "(a+1)/a+2";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testMieszane_2() {
        Wyrazenie instance = new Wyrazenie("(a+1)/a+2");
        String expResult = "(a+1)/a+2";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testAdriana_1() {
        Wyrazenie instance = new Wyrazenie("6a+1/(n+e)+2/(n+e)+1/(n+e+3)+0*(-1)");
        String expResult = "6a+3/(n+e)+1/(n+e+3)";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

    @Test
    public void testAdriana_2() {
        Wyrazenie instance = new Wyrazenie("2^1");
        String expResult = "2";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }
     @Test
    public void testAdriana_3() {
        Wyrazenie instance = new Wyrazenie("0^3");
        String expResult = "1";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

     @Test
    public void testAdriana_4() {
        Wyrazenie instance = new Wyrazenie("a-a+2a");
        String expResult = "2a";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }
      @Test
    public void testAdriana_5() {
        Wyrazenie instance = new Wyrazenie("0^(a-a)");
        String expResult = "0";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }
       @Test
    public void testAdriana_6() {
        Wyrazenie instance = new Wyrazenie("(a-a)*0");
        String expResult = "0";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }
        @Test
    public void testAdriana_7() {
        Wyrazenie instance = new Wyrazenie("23a/23f/34a/23f");
        String expResult = "1/(782)^2";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }

        @Test
    public void testAdriana_8() {
        Wyrazenie instance = new Wyrazenie("(s+e)^2");
        String expResult = "s^2+2se+e^2";
        String result = instance.wykonaj();
        assertEquals(expResult, result);
    }
}