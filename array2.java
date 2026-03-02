package JavaExercises;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {

        int[] origen = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};
        int[] destino = new int[origen.length];

        System.out.print("Son numeros pares: ");
        for (int i : origen) {
            if (i % 2 == 0) {
                System.out.print(i +", ");
            }
        }
        System.out.println();

        System.out.print("Son numeros impares: ");
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] % 2 != 0){
                System.out.print(origen[i]+", ");
            }
        }
        System.out.println();

        System.out.print("Destino de numeros pares: ");
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] % 2 == 0 && origen[i] > 25) {
                destino[i] = origen[i];
                System.out.print(destino[i]+", ");
            }
        }
        System.out.println();


        System.out.print("Destino de numeros impares: ");
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] % 2 != 0 && origen[i] > 25) {
                destino[i] = origen[i];
                System.out.print(destino[i] + ", ");
            }
        }
        System.out.println();
    }
}