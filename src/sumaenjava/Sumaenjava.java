package sumaenjava;
import java.util.*;
/**
 *
 * @author USER
 */
public class Sumaenjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        double num1,num2,resultado;
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println ("inserte el primer numero");
                num1=Teclado.nextDouble();
                
        System.out.println("inserte el segundo numero");
        num2=Teclado.nextDouble();
        
        resultado=num1+num2;
        
        System.out.println("el resultado es = "+resultado);
    }
    
}
