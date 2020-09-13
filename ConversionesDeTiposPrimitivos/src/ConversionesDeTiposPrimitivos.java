
import java.util.Scanner;//Libreria de scanner

//  @author IA_RG

public class ConversionesDeTiposPrimitivos {
    public static void main(String[] args) {
        //Convertir un tipo String a un tipo int
        var edad = Integer.parseInt("25"); //Integer.parseInt comvierte la variable del tipo caden a entero
        System.out.println("edad = " + (edad + 1));
        //En dado caso de no hacer la conversion como resultado tendriamos a 2 cadenas siendo concatenadas
        var altura = "180";
        System.out.println("altura = " + (altura + 1));
        
        //Convertir un tipo String a un tipo double
        var valorPi = Double.parseDouble("3.1416"); //Double.parseDouble convierte a un double 
        System.out.println("valorPi = " + valorPi);
        
        //Usando la funcion scanner (esta en comentarios para seguir con las pruebas
        var consola = new Scanner(System.in);
        /*
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt( consola.nextLine() );//Convierte la cadena numerica ingresada a un numero.
        System.out.println("edad = " + edad);
        */
        //Conversion de un entero a un String
        var edadEnTexto = String.valueOf(edad); //String.valueOf(); hace la conversion
        System.out.println("edadEnTexto = " + edadEnTexto);
        /*Si queremos solicitar solo un caracter y asignarlo a un tipo char de un String se hace lo siguiente
         *utilizando el metodo .charAt(); para proporcionar un indice de los caracteres que contiene la cadena
         *iniciando desde el cero. Proporcionando el indice nos regresara el caracter seleccionado. Ejemplo:
        */
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("\nProporciona una cadena: ");
        caracter = consola.nextLine().charAt(0); //nextLine recupera cadenas y no valores del tipo entero
        System.out.println("EL primer caracter es: " + caracter);
    }
}