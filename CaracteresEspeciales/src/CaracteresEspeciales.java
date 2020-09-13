// @author xande

public class CaracteresEspeciales {

    public static void main(String[] args) {
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre); //Salto de linea en la consola \n
        System.out.println("Tabulador: \t" + nombre); //Uso del tabulador en la consola \t
        System.out.println("Retroseso: \b" + nombre); //Regresa una posicion en la salida de la consola \b
        System.out.println("Comilla simple: \'" + nombre + "\'"); //Coloca comillas simples con metodo de escape \'
        System.out.println("Comilla doble: \"" + nombre + "\""); //Coloca comillas dobles con metodo de escape \"
    }
}
