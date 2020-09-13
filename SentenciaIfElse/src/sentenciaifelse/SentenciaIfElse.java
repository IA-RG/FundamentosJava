/**
 * @author IA_RG
 * ESCOM IPN
 * Link de consulta: https://rsanchezs.gitbooks.io/ciencia-de-datos-con-r/content/estructuras_control/condicionales/estructuras_condicionales.html
 */
package sentenciaifelse;

import java.util.Scanner; //Libreria para el uso de Scanner

public class SentenciaIfElse { //Evalua una expresion booleana

    public static void main(String[] args) {
        var condicion = true;

        if (condicion) { //condicion == true
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }

        //Ejemplo1: Convertimos un numero en letra
        var numero = 1;
        var numeroEnTexto = "Numero desconocido";

        if ( numero == 1 ) {
            numeroEnTexto = "Numero uno";
        } else if ( numero == 2 ) {
            numeroEnTexto = "Numero dos";
        } else if ( numero == 3 ) {
            numeroEnTexto = "Numero tres";
        } else if ( numero ==4 ) {
            numeroEnTexto = "Numero cuatro";
        } else {
            numeroEnTexto = "Numero no encontrado";
        }
        System.out.println("numeroEnTexto = " + numeroEnTexto);
        
        //Ejemplo2: Calculo de estacion del año con if-else
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("\t\nEste programa te dice en que estacion del anio estamos dependiendo del mes");
        System.out.println("Ingresa un mes del anio (1 al 12): ");
        var mes = Integer.parseInt(teclado.nextLine());
        var estacion = "Estacion desconocida";
        
        if(mes ==1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }
        
        System.out.println("\nLa estacion del año es: " + estacion);
    }
}
