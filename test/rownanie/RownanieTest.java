package rownanie;

import org.junit.Test;
import static org.junit.Assert.*;


public class RownanieTest {
    
    Rownanie testoweRownanie;
    
    public RownanieTest() {
        testoweRownanie = new Rownanie();
    }
    
    @Test
    public void RownanieConstructorTest() {
        System.out.println("Constructor");
        assertNotNull(new Rownanie());
        assertNotNull(new Rownanie(2.2,4,-5));
    }


    @Test
    public void testSetRownanie() {
        System.out.println("setRownanie");
        double a = 4;
        double b = 1.5;
        double c = -3;
        Rownanie instance = testoweRownanie;
        instance.setRownanie(a, b, c);
        assertEquals(a, instance.getA(),0);
        assertEquals(b, instance.getB(),0);
        assertEquals(c, instance.getC(),0);
    }

    @Test
    public void testRownanieNull() {
        System.out.println("rownanie błędne");
        Rownanie instance = testoweRownanie;
        instance.setRownanie(0, 5, -3);
        String expResult = null;
        String result = instance.rownanie();
        assertEquals(expResult, result);
    }
        
    @Test
    public void testRownanieZero() {
        System.out.println("rownanie bez pierwiastków");
        Rownanie instance = testoweRownanie;
        instance.setRownanie(2, 3, 4);
        String expResult = "";
        String result = instance.rownanie();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRownanieOne() {
        System.out.println("rownanie z 1 rozwiązaniem");
        Rownanie instance = testoweRownanie;
        instance.setRownanie(4,4,1);
        String expResult = "-8.0";
        String result = instance.rownanie();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRownanieTwo() {
        System.out.println("rownanie z 2 rozwiązaniami");
        Rownanie instance = testoweRownanie;
        instance.setRownanie(2, 5, 3);
        String expResult = "-1.5,-1.0";
        String result = instance.rownanie();
        assertEquals(expResult, result);
    }

}
