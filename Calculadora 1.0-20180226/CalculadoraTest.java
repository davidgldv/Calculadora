

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
    /*Los Test de valor limite estan pensados en base a una calculadora que no sea capaz de almacenar
       mas de 10caracteres*/
    /*No he probado los caracteres invalidos porque supongo que el usuario no va a tener acceso a ellos solo a los caracteres numerecos y las operaciones*/

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
         assertEquals(14 , calc.dameResultado(),0.6);
       }
    @Test
    public void   testSumaValorLimite1() { 
        Calculadora calc = new Calculadora();
         calc.pona(1000000000);
         calc.ponb(5);
         calc.ponOperacion("SUMA");
         calc.opera();
         assertEquals(999999999 , calc.dameResultado(),0.6);
        }
    @Test
    public void   testSumaValorLimite2() { 
        Calculadora calc = new Calculadora();
         calc.pona(-1000000000);
         calc.ponb(-5);
         calc.ponOperacion("SUMA");
         calc.opera();
         assertEquals(-999999999 , calc.dameResultado(),0.6);
        }
    @Test
    public void   testResta() { 
        Calculadora calc = new Calculadora();
         calc.pona(7);
         calc.ponb(-7);
         calc.ponOperacion("RESTA");
         calc.opera();
         assertEquals(14 , calc.dameResultado(),0.6);
     } @Test
    public void   testRestaValorLimite1() { 
        Calculadora calc = new Calculadora();
         calc.pona(1000000000);
         calc.ponb(-5);
         calc.ponOperacion("RESTA");
         calc.opera();
         assertEquals(999999999 , calc.dameResultado(),0.6);
        }
    @Test
    public void   testRestaValorLimite2() { 
        Calculadora calc = new Calculadora();
         calc.pona(-1000000000);
         calc.ponb(5);
         calc.ponOperacion("RESTA");
         calc.opera();
         assertEquals(-999999999 , calc.dameResultado(),0.6);
        }
        
    @Test
    public void   testMultiplicacion() { 
        Calculadora calc = new Calculadora();
         calc.pona(9);
         calc.ponb(2);
         calc.ponOperacion("MULTIPLICA");
         calc.opera();
         assertEquals(18 , calc.dameResultado(),0.6);
 }
     @Test
    public void   testMultiplicacionValorLimite1() { 
        Calculadora calc = new Calculadora();
         calc.pona(1000000000);
         calc.ponb(2);
         calc.ponOperacion("MULTIPLICA");
         calc.opera();
         assertEquals(999999999 , calc.dameResultado(),0.6);
             } 
         @Test
    public void   testMultiplicacionValorLimite2() { 
        Calculadora calc = new Calculadora();
         calc.pona(-1000000000);
         calc.ponb(2);
         calc.ponOperacion("MULTIPLICA");
         calc.opera();
         assertEquals(-999999999 , calc.dameResultado(),0.6);        
    }  
    @Test
    public void   testDivision() { 
        Calculadora calc = new Calculadora();
         calc.pona(8);
         calc.ponb(2);
         calc.ponOperacion("DIVIDE");
         calc.opera();
         assertEquals( 4, calc.dameResultado(),0.6);      
    } 
    @Test
    public void   testDivisionValorLimite1() { 
        Calculadora calc = new Calculadora();
         calc.pona(1000000000);
         calc.ponb(1);
         calc.ponOperacion("DIVIDE");
         calc.opera();
         assertEquals( 999999999, calc.dameResultado(),0.6);       
    }
        @Test
    public void   testDivisionValorLimite2() { 
        Calculadora calc = new Calculadora();
         calc.pona(-1000000000);
         calc.ponb(1);
         calc.ponOperacion("DIVIDE");
         calc.opera();
         assertEquals( -999999999, calc.dameResultado(),0.6);
      
    }
        @Test
    public void   testPotencia1() { 
        Calculadora calc = new Calculadora();
         calc.pona(8);
         calc.ponb(1);
         calc.ponOperacion("POTENCIA");
         calc.opera();
         assertEquals( 8 ,calc.dameResultado(),0.6);        
    }
        @Test
    public void   testPotencia2() { 
        Calculadora calc = new Calculadora();
         calc.pona(8);
         calc.ponb(5);
         calc.ponOperacion("POTENCIA");
         calc.opera();
         assertEquals( 32768, calc.dameResultado(),0.6);        
    }
            @Test
    public void   testPotenciaValorLimite1() { 
        Calculadora calc = new Calculadora();
         calc.pona(899999998);
         calc.ponb(855555874);
         calc.ponOperacion("POTENCIA");
         calc.opera();
         assertEquals( 999999999, calc.dameResultado(),0.6);        
    }
             @Test
    public void   testPotenciaValorLimite2() { 
        Calculadora calc = new Calculadora();
         calc.pona(-899999998);
         calc.ponb(855555873);
         calc.ponOperacion("POTENCIA");
         calc.opera();
         assertEquals( -999999999, calc.dameResultado(),0.6);        
        }
     @Test
    public void   testRAIZ() { 
        Calculadora calc = new Calculadora();
         calc.pona(4);
         calc.ponb(2);
         calc.ponOperacion("RAIZ");
         calc.opera();
         assertEquals(2 , calc.dameResultado(),0.9);     
    }
        @Test
    public void   testFactoriales() { 
        Calculadora calc = new Calculadora();
         calc.pona(-6);
         calc.ponOperacion("FACTORIALES");
         calc.opera();
         assertEquals(720 , calc.dameResultado(),0.6);     
    }
    @Test
    public void   testFactorialesValorLimite1() { 
        Calculadora calc = new Calculadora();
         calc.pona(100);
         calc.ponOperacion("FACTORIALES");
         calc.opera();
         assertEquals(999999999 , calc.dameResultado(),0.6);     
    }
    @Test
    public void   testFactorialesValorLimite2() { 
        Calculadora calc = new Calculadora();
         calc.pona(-101);
         calc.ponOperacion("FACTORIALES");
         calc.opera();
         assertEquals(-999999999 , calc.dameResultado(),0.6);     
    } 
    @Test
    public void   testLogaritmo() { 
        Calculadora calc = new Calculadora();
         calc.pona(5);
         calc.ponb(2);
         calc.ponOperacion("LOGARITMO");
         calc.opera();
         assertEquals(2.32 , calc.dameResultado(),0.9);     
    }
}
