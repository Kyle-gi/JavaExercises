package JavaExercises;

public class array2 {
    public static void main(String[] args) {

        int[] origen = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};

        for (int i = 0; i < origen.length; i++) {
            if (origen[i] % 2 == 0) {
                System.out.print("Son numeros pares: " + origen[i]);
                System.out.println();
            }
        }
    }
}
