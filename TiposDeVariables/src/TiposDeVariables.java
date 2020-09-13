//@author ia_rg

public class TiposDeVariables {
    public static void main(String[] args) {
        //Definimos la variable entera
        int miVariableEntera = 25;
        //TipoDeDato <Identificador_NombreDelaVariable> = AsignacionDeValor_Literal
        System.out.println(miVariableEntera);
        
        //Modificamos el valor de la variable entera
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        //Definimos la variable string
        String miVariableCadena = "Saludos invocador";
        System.out.println(miVariableCadena);
        
        //Modificamos el valor de la variable string
        miVariableCadena = "Good bye my lover";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java (Segun lo que asignemos tomara ese tipo de dato)
        var miVariableEntera2 = 21;
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "Esta es otra cadenna";
        System.out.println("miVariableCadena2 = " + miVariableCadena2); 
        
        /*Reglas para definir una Variable en Java:
        * Inicia con minuscula alternando con mayusculas entre palabras, _ o $.
        * No se recomienda usar tildes u otro tipo de caracteres especiales.
        */
        var mivariable = 1;
        System.out.println("\nmivariable = " + mivariable);
        var _miVariable = 2;
        System.out.println("\n_miVariable = " + _miVariable);
        var $miVariable = 3;
        System.out.println("\n$miVariable = " + $miVariable);
    } 
}