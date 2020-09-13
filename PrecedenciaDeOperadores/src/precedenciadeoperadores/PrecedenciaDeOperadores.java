/**
 * @author IA_RG
 * ESCOM IPN
 * Link de consulta:https://www.arkaitzgarro.com/java/capitulo-4.html consulten la tabla del final.
 */
package precedenciadeoperadores;

public class PrecedenciaDeOperadores {

    public static void main(String[] args) {
        var x = 5;
        var y = 10;
        var z = ++x + y--; //Preincrementando x mas el postdecremento de la variable y (6 + 10)
        System.out.println("x = " + x); //x se preincrementa y arroja un 6
        System.out.println("y = " + y); //y se postdecrementa y arroja un 9
        System.out.println("z = " + z); //z por orden de precedencia arroja 16
        
        //Por orden de prioridad se valua primero la * y / de izq a der, seguido de la suma.
        var resultado = 4 + 5 * 6 /3; //4 + ((5*6)/3)
        System.out.println("resultado = " + resultado);
        //Si queremos cambiar la primoridad de alguna operaciones podemos usar parentesis.
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
    }
    
}
