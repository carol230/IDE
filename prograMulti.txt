import java.util.Arrays;
import java.util.Scanner;
/**
 * Clase principal para realizar operaciones de multiplicación y generar variaciones.
 * @author Ivonne:)
 * @version4
 **/
public class prograMulti {
    /*
     * Método principal donde se ejecuta todo
     **/
    public static void main(String[] args){
    
    char [] arregloPasoUno, arregloPasoDos, arregloPasoTres, arregloPasoCuatro;
    int multiplicacionAcumulativa;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite el número de paso para el proceso uno: ");
    arregloPasoUno= new char [sc.nextInt()];
    arregloPasoUno=llenarArregloCaracteres(arregloPasoUno.length); 
    System.out.println(Arrays.toString(arregloPasoUno));
    
    System.out.println("Digite el número de paso para el proceso dos: ");
    arregloPasoDos= new char [sc.nextInt()];
    arregloPasoDos=llenarArregloCaracteres(arregloPasoDos.length); 
    System.out.println(Arrays.toString(arregloPasoDos));

    System.out.println("Digite el número de paso para el proceso tres: ");
    arregloPasoTres= new char [sc.nextInt()];
    arregloPasoTres=llenarArregloCaracteres(arregloPasoTres.length); 
    System.out.println(Arrays.toString(arregloPasoTres));

    System.out.println("Digite el número de paso para el proceso cuatro: ");
    arregloPasoCuatro= new char [sc.nextInt()];
    arregloPasoCuatro=llenarArregloCaracteres(arregloPasoCuatro.length); 
    System.out.println(Arrays.toString(arregloPasoCuatro));


    multiplicacionAcumulativa= arregloPasoUno.length*arregloPasoDos.length*arregloPasoTres.length*arregloPasoCuatro.length;
    System.out.println("Segun el principio de la multiplicacion usted tiene "+multiplicacionAcumulativa+" formas diferentes ");
    
    llenarVariaciones(arregloPasoUno, arregloPasoDos, arregloPasoTres, arregloPasoCuatro);
    }

    /**
     * Llena un arreglo de caracteres con caracteres de las letras del abecedario (esto por tema visual)
     * @param tamanio El tamaño del arreglo.
     * @return El arreglo lleno.
     **/
    public static char[] llenarArregloCaracteres(int tamanio){
    char [] arregloLleno = new char [tamanio];
    int valorGenerado;
    for(int i=0; i<arregloLleno.length; i++){
    valorGenerado= (int)((Math.random()*26)+65); //en el video usa un rango diferente de caracteres
    arregloLleno[i]= (char) valorGenerado;
    }
    return arregloLleno;
    } 
    /**
     * Muestra todos los casos que hay luego de aplicar el principio de la multiplicacion.
     * @param arreglo1 Primer arreglo=ArregloPasoUno.
     * @param arreglo2 Segundo arreglo=ArregloPasoDos.
     * @param arreglo3 Tercer arreglo=ArregloPasoTres.
     * @param arreglo4 Cuarto arreglo=ArregloPasoCuatro.
     **/
    public static void llenarVariaciones(char[] arreglo1, char[] arreglo2, char[] arreglo3, char[] arreglo4){
        for(char dato1 : arreglo1){
            for(char dato2 : arreglo2){
                for(char dato3 : arreglo3){
                    for(char dato4 : arreglo4){
                        System.out.println(dato1+" "+dato2+" "+dato3+" "+dato4);
                    }
                }
            }
        }
    }
}