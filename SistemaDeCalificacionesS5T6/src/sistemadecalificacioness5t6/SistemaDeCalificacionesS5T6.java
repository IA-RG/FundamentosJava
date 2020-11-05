/**
 * @author IA_RG
 * ESCOM IPN
 */

package sistemadecalificacioness5t6;

import java.util.Scanner;

public class SistemaDeCalificacionesS5T6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nIngrese una calificacion entre 0 y 10: ");
        var calificacion = Integer.parseInt(teclado.nextLine());
        System.out.print("La calificacion que ingreso es: " + calificacion);
        
        //Si esta entre 9 y 10 imprimir: A
        if(calificacion >=9 && calificacion <= 10)
            System.out.println("\nSu resultado es A");
        
        //Si esta entre 8 y menor a 9 imprimir: B
        else if(calificacion >=8 && calificacion < 9)
            System.out.println("\nSu resultado es B");
        
        //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion >=7 && calificacion < 8)
            System.out.println("\nSu resultado es C");
        
        //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion >=6 && calificacion < 7)
            System.out.println("\nSu resultado es D");
        
        //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion >=0 && calificacion <= 6)
            System.out.println("\nSu resultado es F");
        
        //Si no esta en el rango, imprime: Valor desconocido
        else
            System.out.println("\nValor desconocido");
    } 
}
