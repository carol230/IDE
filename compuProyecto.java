import java.util.Arrays;

public class compuProyecto {
    /**
     * Funcion main
     * @param args
     */
    public static void main(String[] args) {
        char[] arreglo = {'A', 'D', 'C', 'M'};

        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("\n 4P4=4!/(4-4)!=24");
        System.out.println("Permutaciones 4P4:");
        operacionPermutacion(arreglo);

        System.out.println("\n 4C4=4!/4!(4-4)!=1");

        System.out.println("\n Combinacion 4C4:"+(Arrays.toString(arreglo)));
    }
    
    /**
     * Funcion que realiza las permutaciones y donde se imprimen
     * @param arreglo
     */
    public static void operacionPermutacion(char[] arreglo) {
        int[] indices = new int[4];
        for (int i = 0; i < 4; i++) {
            indices[i] = 0;
        }

        System.out.println(Arrays.toString(arreglo));

        int i = 0;
        while (i < 4) {
            if (indices[i] < i) {
                char almacenar = arreglo[i % 2 == 0 ? 0 : indices[i]];
                arreglo[i % 2 == 0 ? 0 : indices[i]] = arreglo[i];
                arreglo[i] = almacenar;

                System.out.println(Arrays.toString(arreglo));
                indices[i]++;
                i = 0;
            } else {
                indices[i] = 0;
                i++;
            }
        }
    }
}


