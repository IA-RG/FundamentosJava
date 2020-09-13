/**
 * @author IA_RG
 * ESCOM IPN
 */
package operadoresunarios;

public class OperadoresUnarios {

    public static void main(String[] args) {
        var a = 3;
        var b = -a; //Operador unario de cambio de signo -
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //Operador de negacion aplica para variables del tipo boolean
        var c = true;
        var d = !c; //Operador unario de negacion !
        System.out.println("\nc = " + c);
        System.out.println("d = " + d);
        
        //Operador unario de incremento (preincremento/postincremento)
        //1. Preincremento ++<variable>
        var e = 3;
        var f = ++e; //Preincremento: Se incrementa la variable y despues se usa su valor 
        System.out.println("\ne = " + e);//La variable e se preincremento y vale 4
        System.out.println("f = " + f);//f mantiene el valor de e
        //2. Postincremento <variable>++
        var g = 5;
        var h = g++; //Postincremento:Primero se utiliza el valor de la variable g y despues se incrementa
        System.out.println("\ng = " + g); //Se aplica el incremento pendiente
        System.out.println("h = " + h); //Toma el primer valor que tenia la variable
        
        //Decremento (lo inverso al incremento :v)
        //1. Predecremento --<variable>
        var i = 2;
        var j = --i;
        System.out.println("\ni = " + i);
        System.out.println("j = " + j);
        
        //2. Postdecremento
        var k = 4;
        var l = k--;
        System.out.println("\nk = " + k); // Se aplica el decremento pendiente
        System.out.println("l = " + l); //Toma el primer valor que tenia la variable
        
    }
    
}
