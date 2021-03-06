
/**
 * 
 * 
 * @author David Guzman
 * @version3.0
 */



public class Calculadora
{
    private double a;
    private double b;
    private double rdo;
    private Operacion op;
    private double ERROR;
    private double ERROR1;


    public Calculadora()
    {

        a= 0.0;
        b = 0.0;
        op=op.SUMA;
        ERROR=999999999;
        ERROR1=-999999999;
        
    }
    
    public void pona(double n1)
    {
        // put your code here
        this.a=n1;
    }
    
    public void ponb(double n2)
    {
        // put your code here
        this.b=n2;
    }

    public void opera() /*Los if con la condicion de rdo sirven para fijar un valor limite*/
    {
        switch(op){
            case SUMA:
                rdo= a + b;
                if(rdo>=999999999){
                    rdo=ERROR;
                }  
                if(rdo <=-999999999){
                    rdo=ERROR1;
                }  
                break;
            case RESTA:
                rdo= a - b;
                 if(rdo>=999999999){
                    rdo=ERROR;
                }  
                if(rdo <=-999999999){
                    rdo=ERROR1;
                } 
                break;
            case MULTIPLICA:
                rdo=a * b;
               if(rdo>=999999999){
                    rdo=ERROR;
                }  
               if(rdo <=-999999999){
                    rdo=ERROR1;
                } 
                break;
            case DIVIDE:
                rdo=a/b;

            if(rdo >=999999999){
                    rdo=ERROR;
                } 
            if(rdo <=-999999999){
                    rdo=ERROR1;
                } 
            
           break;
            case POTENCIA:
               rdo=Math.pow(a,b);
            if(rdo>=999999999){
                    rdo=ERROR;
                }  
            if(rdo <=-999999999){
                    rdo=ERROR1;
                } 
           break;
          
            case RAIZ:  /*Esta funcion sirve para hacer raices de distintos radicandos*/
              rdo = Math.pow(a,1.0/b);
            if(rdo>999999999){
                    rdo=ERROR;
                }  
            if(rdo <=-999999999){
                    rdo=ERROR1;
                } 
                   break;
             case FACTORIALES:
             if (a == 0){
                 rdo=0;
            }   
            else{
                rdo=1;
            }
                if( a > 0){
                while( a!=0){
                       rdo*=a;
                       a--;
                }
            }
                else {
                while( a!=0){
                       rdo*=a;
                       a++;
                }
                }
                if(rdo>=999999999){
                    rdo=ERROR;
                }  
            if(rdo <=-999999999){
                    rdo=ERROR1;
                } 
                break;
                case LOGARITMO: /*Esta funcion sirve para calcular el logaritmo en distintas bases*/
                rdo = (Math.log10(a) / Math.log10(b));

                break;
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
        case "RAIZ":
            op=op.RAIZ;
            break;
        case "FACTORIALES":
            op=op.FACTORIALES;
            break;
        case  "LOGARITMO":
            op=op.LOGARITMO;
            break;
        }
    }
    
    public double dameResultado()
    {
        return rdo;
    }
     public void muestraTodosResultados(){
        System.out.println("Num1="+a+" Num2=" +b+"");
        System.out.println("Suma :" +(a+b)+"");
        System.out.println("Resta :"+(a-b)+"");
        System.out.println("Multiplica :" +(a*b)+"");
        System.out.println("Divide :"+(a/b)+"");
        System.out.println("Potencia :"+Math.pow((double)a,(double)b)+"");
        System.out.println("Raiz :"+Math.pow((double)a,1/(double)b)+"");
        System.out.println("Logaritmo :"+(Math.log10(a) / Math.log10(b))+"");
        /*Aqui muestro los resultados independientemente de los valores limites ya que realmente es capaz de realizar esas operaciones*/ 
        
}

}
