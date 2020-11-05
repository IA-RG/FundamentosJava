/**
 * @author IA_RG
 * ESCOM IPN
 */

package switchcalculodeestacion;

public class SwitchCalculoDeEstacion {

    public static void main(String[] args) {
        var mes = 3;
        var estacion = "Estacion desconocida";
        
        switch(mes){
            case 12: case 1: case 2:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
            default:
                System.out.println("Estacion no encontrada"); 
        }
        System.out.println("estacion = " + estacion);
    }
    
}
