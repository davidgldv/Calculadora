

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculadoraTest
{ 
     private double a;
    private double b;
    private double rdo;
    private Operacion op;
    private double ERROR;
    
    public CalculadoraTest()
    {
        a= 0.0;
        b = 0.0;
        op=op.SUMA;
        ERROR=999999999;
        
    }

    @Test
    public void   testSuma() { 
        Calculadora calc = new Calculadora();
         calc.pona(9);
         calc.ponb(5);
         calc.ponOperacion("SUMA");
         calc.opera();
         assertEquals(14 , calc.dameResultado());
         
          
    }

    @Test
    public void   testResta() { 
        Calculadora calc = new Calculadora();
         calc.pona(7);
         calc.ponb(-7);
         calc.ponOperacion("RESTA");
         calc.opera();
         assertEquals(14 , calc.dameResultado());
         
          
    }
    @Test
    public void   testMultiplicacion() { 
        Calculadora calc = new Calculadora();
         calc.pona(9);
         calc.ponb(2);
         calc.ponOperacion("MULTIPLICA");
         calc.opera();
         assertEquals(18 , calc.dameResultado());
         
          
    }
            
    @Test
    public void   testDivision() { 
        Calculadora calc = new Calculadora();
         calc.pona(8);
         calc.ponb(2);
         calc.ponOperacion("DIVIDE");
         calc.opera();
         assertEquals( 4, calc.dameResultado());
         
          
    }
    
    @Test
    public void   testDivisionCon0() { 
        Calculadora calc = new Calculadora();
         calc.pona(8);
         calc.ponb(0);
         calc.ponOperacion("DIVIDE");
         calc.opera();
         assertEquals( 999999999, calc.dameResultado());
         
          
    }

        @Test
    public void   testPotencia1() { 
        Calculadora calc = new Calculadora();
         calc.pona(8);
         calc.ponb(1);
         calc.ponOperacion("POTENCIA");
         calc.opera();
         assertEquals( 8 ,calc.dameResultado());
         
          
    }
        @Test
    public void   testPotencia2() { 
        Calculadora calc = new Calculadora();
         calc.pona(8);
         calc.ponb(5);
         calc.ponOperacion("POTENCIA");
         calc.opera();
         assertEquals( 32768, calc.dameResultado());
         
          
    }
     @Test
    public void   testRAIZ() { 
        Calculadora calc = new Calculadora();
         calc.pona(4);
         calc.ponb(2);
         calc.ponOperacion("RAIZ");
         calc.opera();
         assertEquals(2 , calc.dameResultado());
         
          
    }
         @Test
    public void   testRAIZ_CARACTER_INVALIDO() { 
        Calculadora calc = new Calculadora();
         calc.pona(2048);
         calc.ponb(11);
         calc.ponOperacion("RAIZ");
         calc.opera();
         assertEquals(999999999 , calc.dameResultado());
         
          
    }
}
