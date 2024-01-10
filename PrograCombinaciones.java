import java.util.Arrays;

public class PrograCombinaciones {

    public static void main(String[] args) {
        char[] conjunto = llenarArregloCaracteres(4);
        System.out.println("Conjunto original: " + Arrays.toString(conjunto));

        int combinaciones4C2 = generarCombinaciones(conjunto, 2);
        System.out.println("Resultado de 4C2: " + combinaciones4C2);
    }

    public static char[] llenarArregloCaracteres(int tamanio) {
        char[] arregloLleno = new char[tamanio];
        int valorGenerado;
        for (int i = 0; i < arregloLleno.length; i++) {
            valorGenerado = (int) ((Math.random() * 26) + 65);
            arregloLleno[i] = (char) valorGenerado;
        }
        return arregloLleno;
    }

    public static int generarCombinaciones(char[] conjunto, int r) {
        if (r < 1 || r > conjunto.length) {
            System.out.println("El valor de r debe estar entre 1 y el tamaño del conjunto.");
            return 0;
        }

        System.out.println("Combinaciones posibles:");
        System.out.println("----------------------");

        int combinaciones = 0;

        for (int i = 0; i < conjunto.length; i++) {
            for (int j = i + 1; j < conjunto.length; j++) {
                System.out.println(conjunto[i] + " " + conjunto[j]);
                combinaciones++;
            }
        }

        return combinaciones;
    }
}

