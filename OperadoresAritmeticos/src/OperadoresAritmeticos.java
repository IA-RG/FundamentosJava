
import java.util.Scanner;

/**
 * @author IA_RG
 * ESCOM IPN
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        //Al declarar varias variables debemos especificar el tipo de dato, en este caso no es recomendable usar var
        int a=3, b=2; 
        //Suma
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        //Resta
        resultado = a - b; //Como ya inferemos el tipo de dato, no hay necesidad de declararlo nuevamente
        System.out.println("resultado resta = " + resultado);
        //Multiplicacion
        resultado = a * b;
        System.out.println(" multiplicacion = " + resultado);
        //Division
        /*
        resultado = a / b;
        System.out.println(" division = " + resultado); 
        * La salida es 1 dado a que esta en variables enteras, para solucionarlo hay que usar una literal
        * de punto flotante declarando una nueva variable.
        */
        var resultado2 = 3D / b; //Especificamos en la literal que es un tipo de dato double
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado residuo = " + resultado);
        
        //Comprobando si un numero es par o impar
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        var numero = Integer.parseInt(consola.nextLine());
        if(numero % 2 == 0) {
            System.out.println("Su numero " + numero + " es un numero par");
        }
        else {
            System.out.println("Su numero " + numero + " es un numero impar");
        }
    }   
    
}
