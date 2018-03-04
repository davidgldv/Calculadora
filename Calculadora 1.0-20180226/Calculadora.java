
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */



public class Calculadora
{
    // instance variables - replace the example below with your own
    private int a;
    private int b;
    private int rdo;
    private Operacion op;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        a= 0;
        b = 0;
        op=op.SUMA;
        
    }
    
    public void pona(int n1)
    {
        // put your code here
        this.a=n1;
    }
    
    public void ponb(int n2)
    {
        // put your code here
        this.b=n2;
    }

    public void opera()
    {
        switch(op){
            case SUMA:
                rdo= a + b;
                break;
            case RESTA:
                rdo= a-b;
                break;
            case MULTIPLICA:
                rdo=a*b;
                break;
            case DIVIDE:
                rdo=a/b;
                break;
            case POTENCIA:
            if (b > 1){
            for( int c=1 ;  c < b ;  c ++){
                if( c == 1){
                    rdo=a*a;
                  
                }
                else 
                    rdo=rdo*a;
            }
        }
            else 
                    rdo=a;
   }
}
    public void ponOperacion(String opera){
        switch(opera){
        
        case "SUMA":
            op=op.SUMA;
            break;
        case "RESTA":
            op=op.RESTA;
            break;
        case "MULTIPLICA":
            op=op.MULTIPLICA;
            break;
        case "DIVIDE":
            op=op.DIVIDE;
            break;
        case "POTENCIA":
            op=op.POTENCIA;
            break;
        }
    }
    
    public int dameResultado()
    {
        // put your code here
        return rdo;
    }
    
    public void muestraTodosResultados(){
        System.out.println("Num1="+Integer.toString(a)+" Num2=" + Integer.toString(b));
        System.out.println("Suma :" + Integer.toString(a+ b));
        System.out.println("Resta :"+ Integer.toString(a-b));
        System.out.println("Multiplica :" + Integer.toString(a*b));
        System.out.println("Divide :"+ Integer.toString(a/b));
      

    }
}
