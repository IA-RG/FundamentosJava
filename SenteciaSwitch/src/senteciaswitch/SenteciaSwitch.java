/**
 * @author IA_RG
 * ESCOM IPN
 * Link de consulta: https://javadesdecero.es/basico/sentencia-switch-java-ejemplo/#:~:text=1.-,switch%20case%20en%20Java,%2C%20short%2C%20char%20e%20int.
 */
package senteciaswitch;

public class SenteciaSwitch { //Evalua una expresion de tipo numerico o de tipo String

    public static void main(String[] args) {
        var numero = 3;
        var numeroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}
