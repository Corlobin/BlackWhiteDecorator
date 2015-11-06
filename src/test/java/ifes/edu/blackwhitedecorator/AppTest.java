package ifes.edu.blackwhitedecorator;

import ifes.edu.blackwhitedecorator.cdp.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    
    /* Primeiro fazer o teste falhar e depois fazer ele rodar. */
    /* Testando os preços. */
   
    public void test1()
    {   
        Cafe cafe = new CafeNormal();
        assertEquals(cafe.getPreco(), 2.0);
    }

    public void test2()
    {   
        Cafe cafe = new CafeNormal();
        cafe = new CafeChantili(cafe);
        assertEquals(cafe.getPreco(), 3.0);
    }

    public void test3()
    {   
        Cafe cafe = new CafeNormal();
        cafe = new CafeChantili(cafe);
        cafe = new CafeChocolate(cafe);
        assertEquals(cafe.getPreco(), 3.5);
    }

    public void test4()
    {   
        Cafe cafe = new CafeNormal();
        cafe = new CafeChantili(cafe);
        cafe = new CafeChocolate(cafe);
        cafe = new CafeCremeLaranja(cafe);
        assertEquals(cafe.getPreco(), 5.0);
    }

    public void test5()
    {   
        Cafe cafe = new CafeNormal();
        cafe = new CafeChantili(cafe);
        cafe = new CafeChocolate(cafe);
        cafe = new CafeCremeLaranja(cafe);
        cafe = new CafeLicor(cafe);
        assertEquals(cafe.getPreco(), 7.5);
    }

    
}
