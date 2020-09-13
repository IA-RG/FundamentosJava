//Importamos el paquete de Scanner

import java.util.Scanner;

//@author xande
public class Escaner {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine(); //Lee una linea completa de la consola
        System.out.println("usuario = " + usuario); //Imprime el usuario
        System.out.println("Excribe el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}
