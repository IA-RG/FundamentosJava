/**
 * @author IA_RG
 * ESCOM IPN
 */
package ciclodowhile;

public class CicloDoWhile {
    public static void main(String[] args) {
        var contador = 0;
        //do se ejecuta al menos una vez
        do{
            System.out.println("contador = " + contador);
            contador++;//Incrementa hasta que sea menor a 3
        }while(contador < 0);//La condicion se incluye al final aunque sea fals y se ejecuta al menos una vez
    }
}
