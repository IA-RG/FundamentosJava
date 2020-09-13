/**
 * @author IA_RG
 * ESCOM IPN
 * Link de consulta: http://www.manualweb.net/java/operadores-condicionales-java/
 */
package operadorescondicionales;
/*
 *Los operadores condicionales son AND (&&) y OR (||)  
*/
public class OperadoresCondicionales {

    public static void main(String[] args) {
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        //Operador AND (&&)
        var resultado = a >= valorMinimo && a <= valorMaximo; // var resultado = (a >= valorMinimo && a <= valorMinimo);
        System.out.println("resultado = " + resultado); //Solo nos regresa un true si ambos lados de la expresion son verdadores
        if(resultado) { //if (resultado == true)
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        //Operador OR (||)
        //Ejemplo: Un padre puede asistir a ver el juego de su hijo solo si son vacaciones o si es dia de descanso
        var vacaciones = true; //El padre no tiene vacaiones
        var diaDeDescanso = false; //El padre no tiene dia de descanso
        
        if( vacaciones || diaDeDescanso ) { //Regresa un true con que una de las expresiones sea verdadera
            System.out.println("Puede asistir al juego de su hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
    }
    
}
