package JavaExercises;

public class array2 {
    public static void main(String[] args) {

        int[] origen = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};
        int[] destino = new int[origen.length];

        for (int i = 0; i < origen.length; i++) {
            if (origen[i] % 2 == 0) {
                System.out.print("Son numeros pares: " + origen[i]);
                System.out.println();
            }
            if (origen[i] % 2 != 0){
                System.out.print("Son numeros impares: " + origen[i]);
                System.out.println();
            }
        }


        for (int i = 0; i < destino.length; i++){
            if (destino[i] % 2 == 0 && destino[i] > 25){
                System.out.print("Destino de numeros pares: " + destino[i]);
                System.out.println();
            }
            if (destino[i] % 2 != 0 && destino[i] > 25){
                System.out.print("Destino de numeros impares: " + destino[i]);
                System.out.println();
            }
        }

    }
}