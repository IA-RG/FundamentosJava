//@author xander

public class TiposPrimitivosJava {

    public static void main(String[] args) {
        
        //Tipos primitivos enteros: byte 8 bits, short 16 bits, int 32 bits, long 64 bits
        
        byte numeroByteDentroDelRango = 120; //Declaramos un bumero del tipo byte
        byte numeroByteFueraDelRango = (byte)129; //Casting de un tipo entero a un tipo byte
        System.out.println("\nnumeroByteDentroDelRango: " + numeroByteDentroDelRango);
        System.out.println("numeroByteFueraDelRango: " + numeroByteFueraDelRango);
        //Rango de numeros que puede almacenar el byte
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        
        //Declaramos un numero del tipo byte
        short numeroShortDentroDelRango = 15;
        short numeroShortFueraDelRango = (short)32768;
        System.out.println("\nnumeroShortDentroDelRango = " + numeroShortDentroDelRango);
        System.out.println("numeroShortFueraDelRango = " + numeroShortFueraDelRango);
        //Rango de numeros que puede almacenar el short
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        
        //Declaramos un numero del tipo int
        int numeroIntDentroDelRango = 25;
        int numeroIntFueraDelRango = (int)2147483649L;//Casting a literal del tipo long de 32 bits
        System.out.println("\nnumeroIntDentroDelRango = " + numeroIntDentroDelRango);
        System.out.println("numeroIntFueraDelRango = " + numeroIntFueraDelRango);
        //Rango de numeros que puede almacenar el int
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        
        //Declaramos un numero del tipo long
        long numeroLongDentroDelRango = 52415464;
        long numeroLongFueraDelRango = 9223372036854775807L;//L para soportar el tipo long en la literal
        System.out.println("\nnumeroLongDentroDelRango = " + numeroLongDentroDelRango);
        System.out.println("numeroLongFueraDelRango = " + numeroLongFueraDelRango);
        //Rangos de numeros que puede almacenar long
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        
        
        //Declaramos un numero del tipo float
        float numeroFloatDentroDelRango = (float)10.0F; //Literales con float en java viene  por defecto con double y se agrega el casting a float o la F
        float numeroFloatFueraDelRango = (float)3.4028235E38D;// Casting de float a double para superar el limite maximo
        System.out.println("\numeroFloatDentroDelRango = " + numeroFloatDentroDelRango);
        System.out.println("numeroFloatFueraDelRango = " + numeroFloatFueraDelRango);
        //Rangos de numeros que puede almacenar long
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        
        
        //Declaramos un numero del tipo double
        double numeroDoubleDentroDelRango = 25; //Double no requiere ningun tipo de casting para trabajar
        double numeroDoubleFueraDelRango = 1.7976931348623157E308; //Limite maximo por defecto de Java (no requiere especificacion)
        System.out.println("\numeroDoubleDentroDelRango = " + numeroDoubleDentroDelRango);
        System.out.println("numeroDoubleFueraDelRango = " + numeroDoubleFueraDelRango);
        //Rangos de numeros que puede almacenar double
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
    }
}
