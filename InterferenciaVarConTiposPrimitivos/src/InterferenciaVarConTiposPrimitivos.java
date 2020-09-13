//@author IA_RG

public class InterferenciaVarConTiposPrimitivos {

    public static void main(String[] args) {
        /*
        * Para agregar un punto de ruptura damos click sobre la linea numerica del codigo donde
        * nos va a generar un 'Line Breakpoint' esto sirve para debugear el programa y probarlo
        * paso a paso cada vez que ejecutimos algun tipo de operacion nueva donde lo requerimos.
        * Para compilarlo damos click derecho sobre el editor y corremos en modo 'Debug File' y 
        * para ir al paso siguiente damos click en 'Step Over' (F8) hasta terminar el programa o 
        * correrlo completo con 'Run Project'.
        * La inferencia de tipos solo se usa para long, float y double (L,F y D)
        */
        var numeroEntero = 25; //Si la literal no tine punto flotante y son del tipo numerico son int por default
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0; //Literal de tipo double
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F; //F para especificar que es una literal del tipo float
        System.out.println("numeroFloat = " + numeroFloat);
        
        //Tipo char en java (almacena 16 bits)
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        //Tambien se puede imprimir una lista de caracteres en unicode por medio de un char usando \ u
        char variableCharUnicode = '\u0021';
        System.out.println("variableCharUnicode = " + variableCharUnicode);
        //Asignarcion de caracter de forma decimal. Ya que esta declarado como un char hace la conversion.
        char variableCharDecimal = 33;
        System.out.println("variableCharDecimal = " + variableCharDecimal);
        //Asignacion por simbolo directamente
        char variableCharSimbolo = '!';
        System.out.println("variableCharSimbolo = " + variableCharSimbolo);
        
        //Haciendo uso de la inferencia de tipo var
        var varCharUnicode = '\u0021';
        System.out.println("\nvarCharUnicode = " + varCharUnicode);
        //Por inferencia de tipo lo va a tomar como una variable de tipo int en vez del tipo char
        var varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        var varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //Un char se puede asignar a un tipo entero por que soporta la diferencia de bits entre ellos
        int variableEnteraSimbolo = '!';
        System.out.println("\nvariableEnteraSimbolo = " + variableEnteraSimbolo);
        //Pero a la hora de imprimir esta variable impime su codigo decimal EJ:
        int letraMinuscula = 'a';
        System.out.println("\nletraMinuscula = " + letraMinuscula);
        int letraMayuscula = 'A';
        System.out.println("letraMayuscula = " + letraMayuscula);
        
        //Primitivos tipo boolean solo tiene true y false
        boolean variableBoolean = false; //Operador del tipo bandera
        System.out.println("\nvariableBoolean = " + variableBoolean);
        
        //Ejemplo: Cambia la bandera de true a false para cambiar lo que se imprime en el if
        if (variableBoolean) {
            System.out.println("\nLa bandera es verdadera");
        }
        else {
            System.out.println("\nLa bandera es falsa");
        }
        //Ejemplo para saber si una persona es mayor de edad.
        
        var edad = 30; 
        var esAdulto = edad >= 18; //Esta expresion va a regresar un true o un false
        if(esAdulto) {
            System.out.println("\nEres mayor de edad");
        }
        else {
            System.out.println("\nEres menor de edad");
        }
    }
}