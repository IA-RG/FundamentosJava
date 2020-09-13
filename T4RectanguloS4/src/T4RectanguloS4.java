
import java.util.Scanner;

/*
 * @author IA_RG
 * ESCOM IPN
 */
public class T4RectanguloS4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\tEste programa calula el perimetro de un rectangulo");
        
        System.out.println("\nIngresa la altura del rectangulo: ");
        var alturaRectangulo = Double.parseDouble(teclado.nextLine());
        
        System.out.println("Ingresa la base del rectangulo: ");
        var baseRectangulo = Double.parseDouble(teclado.nextLine());
       
        var areaRectangulo = alturaRectangulo * baseRectangulo;
        var perimetroRectangulo = (alturaRectangulo + baseRectangulo) * 2;
        
        System.out.println("El area del rectangulo es = " + areaRectangulo);
        System.out.println("El perimetro de su rectangulo es = " + perimetroRectangulo);
    }

}
