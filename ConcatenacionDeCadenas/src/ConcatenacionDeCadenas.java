// @author xande

public class ConcatenacionDeCadenas {

    public static void main(String[] args) {
        var usuario = "IA_RG";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        /*No se recomienda usar nombres cortos en las variables (una letra).
        * Esas se recomiendan para ciclos, columnas o filas.
        */
        var i = 3;
        var j = 4;
        //las expresiones se valuan de izquierda a derecha y por orden de prioridad.
        System.out.println(i + j); //Se realiza la suma de numeros
        System.out.println(i + j + usuario); //Si encuentra primero una suma, trabaja con las sumas y despues concatena.
        System.out.println(usuario + i + j); //Contexto cadena: Si encuentra primero una cadena, todo lo toma como una cadena.
        System.out.println(usuario + (i + j)); //Podemos usar parentesis para dar prioridad a una operacion sobre otra.
    }
}
