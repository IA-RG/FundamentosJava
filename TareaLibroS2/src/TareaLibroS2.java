// @author IA_RG

import java.util.Scanner;

public class TareaLibroS2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Proporcione el titulo: ");
        var titulo = teclado.nextLine();
        
        System.out.println("Proporcione al autor: ");
        var autor = teclado.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);
    }
}