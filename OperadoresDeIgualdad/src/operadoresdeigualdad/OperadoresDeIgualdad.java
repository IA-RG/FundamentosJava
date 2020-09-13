/**
 * @author IA_RG
 * ESCOM IPN
 */
package operadoresdeigualdad;

public class OperadoresDeIgualdad { //Y relacionales

    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        //Operador de  relacion == comparar 2 valores y regresa un boolean (true/false)
        var c = (a == b);
        System.out.println("c = " + c);

        //Operador diferencia != compara 2 valores y regresa un boolean (true son diferentes/ false son iguales)
        var d = a != b; // var d = (a != b);
        System.out.println("d = " + d);
        //Nota: Cuando trabajamos con objetos la igualdad funciona como la referencia de las variables a objetos

        //Operaciones con cadenas
        var cadena1 = "Hola";
        var cadena2 = "Hola";
        var e = cadena1 == cadena2; // var e = (cadena1 == cadena2) aqui solo compara referencias de los objetos cadena1 y cadena2
        System.out.println("e = " + e);

        //Comparando el contenido de las variables cadenas1 y cadena2
        var f = cadena1.equals(cadena2); // <objeto1>.equals(<objeto2>) compara el contenido dentro de los objetos tipo String.
        System.out.println("f = " + f);

        //Operadores relacionales
        //Nos dice si un valor es =< o => (igual o menor / igual o mayor)
        var g = a >= b; //Estamos preguntando si 3 >= 2 (a>=b)
        System.out.println("\ng = " + g); //g almacena el valor de verdadero ya a si es mayor o igual que b
        
        //Ejemplo 1: Saber si un numero es par o impar dedpendiendo de su residuo
        if (a % 2 == 0) { //Recordemos que el valor de a = 3.
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }
        
        //Ejemplo 2: Saber si una persona es un adulto
        var edad = 16;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("\nEs un adulto");
        } else {
            System.out.println("\nEs menor de edad");
        }
    }

}
