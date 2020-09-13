/**
 * @author IA_RG
 * ESCOM IPN
 */
package operadorternario;
/*
 *Tiene 3 partes. Una condicion que se debe de valuar y dependiendo de ese valor regresa uno u otro valor
 *simplificando el uso de la sentencia if else.
*/
public class OperadorTernario {

    public static void main(String[] args) {
        /*
         *La primer parte del operador es una expresion booleana que devuelve un true/false
         *? La segunda parte es la que se ejecuta de ser cierta 
         *: de lo contrario se ejecuta la tercer parte
         * <condicion> ? <se ejecuta de ser true> : <se ejecuta de ser false>
        */
        var resultado = (1>2) ? "verdadero" : "false";
        System.out.println("resultado = " + resultado);
        
        //Ejemplo: Saber si un numero es par o impar
        var numero = 7;
        resultado = (numero%2 == 0) ? "el numero es par" : "el numero es impar";
        System.out.println("El numero ingresado fue: " + numero + "\nPor lo tanto " + resultado);
}
}