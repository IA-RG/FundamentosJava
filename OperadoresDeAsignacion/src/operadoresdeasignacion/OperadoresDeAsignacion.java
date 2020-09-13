/**
 * @author IA_RG
 * ESCOM IPN
 */
package operadoresdeasignacion;

public class OperadoresDeAsignacion {

    public static void main(String[] args) {
        
        int a = 3, b = 2;
        int c = a + 5 - b; //Todo lo que esta del lado derecho se valua y se asigna a c. (= simbolo de asignacion)
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        a += 1; //a = a + 1 sintaxis con operador de composicion.
        System.out.println("\nOperador de composicion a += 1 = " + a);
        
        a += 3; //a = a + 3;
        System.out.println("Operador de composicion a += 3 = " + a);
        
        a -= 2; //a = a - 2;
        System.out.println("Operador de composicion a -= 2  = " + a);
        
        b *= 4; //b = b*4;
        System.out.println("\nOperador de composicion b *= 4  = " + b);
        
        b /= 2; // b = b/2;
        System.out.println("Operador de composicion b /= 2  = " + b);
        
        b %= 3; // b = b%3;
        System.out.println("Operador de composicion b %= 3  = " + b);
    }
    
}
