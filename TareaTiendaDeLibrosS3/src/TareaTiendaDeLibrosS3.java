//Se importa la clase Scanner para introducir los datos por consola
import java.util.Scanner;
/*
 *@author IA_RG 
 * ESCOM IPN
*/
public class TareaTiendaDeLibrosS3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in); //Creamos un Scanner llamado consola
        
        System.out.println("Proporcione el nombre del libro: ");
        var nombreLibro = consola.nextLine();
        
        System.out.println("Proporcione el id:");
        var idLibro = Integer.parseInt(consola.nextLine()); //Conversion a tipo entero
        
        System.out.println("Proporcione el precio: ");
        var precioLibro = Double.parseDouble(consola.nextLine()); //Conversion a tipo double
        
        System.out.println("Proporcione el envio gratuito (true/false)");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine()); //Conversion a tipo boolean
        System.out.println("nombreLibro = " + nombreLibro + " #" + idLibro);
        System.out.println("precioLibro = " + precioLibro);
        //Condicion if else para aplicar el boolean sobre el envio gratuito
        if (envioGratuito == true) {
            System.out.println("Aplica envio gratuito = " + envioGratuito);
        }
        else {
            System.out.println("No aplica envio gratuito = " + envioGratuito);
        }
    }
}