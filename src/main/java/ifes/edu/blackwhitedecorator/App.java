package ifes.edu.blackwhitedecorator;

import ifes.edu.blackwhitedecorator.cdp.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cafe cafe = new CafeNormal();
        cafe = new CafeChocolate(cafe);
        cafe = new CafeCremeLaranja(cafe);
        System.out.println(cafe.getPreco());
    }
}
