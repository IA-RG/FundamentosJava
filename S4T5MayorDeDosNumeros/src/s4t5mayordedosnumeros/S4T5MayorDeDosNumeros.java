/**
 * @author IA_RG
 * ESCOM IPN
 */
package s4t5mayordedosnumeros;

import java.util.Scanner;
//S4 = seccion 4, T5 = tarea 5
public class S4T5MayorDeDosNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\t Este programa muestra cual es el mayor de dos numeros.");
        System.out.println("Ingrese el primer numero: ");
        var numero1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        var numero2 = Double.parseDouble(teclado.nextLine());
        //Haciendo uso del operador ternario
        var resultado = (numero1 > numero2) 
                ? "El primer numero ingresado es el numero mas grande (" + numero1 + ")" 
                : "El segundo numero ingresado es el numero mas grande (" + numero2 + ")";
        System.out.println("Resultado ternario: " + resultado);
        //Haciendo uso del operador AND
        if (numero1 > numero2 && numero2 < numero1 ) {
            System.out.println("Resultado AND: El primer numero ingresado es el numero mas grande (" + numero1 + ")");
        } else{
            System.out.println("Resultado AND: El segundo numero ingresado es el numero mas grande (" + numero2 + ")");
        }
    }
    
}
