package JavaExercises;

public class array10 {
    public static void main(String[] args){
        int[] posicion = {5, 6, 7, 8, 9, 10};

        int temp = posicion[0];
        posicion[0] = posicion[5];
        posicion[5] = temp;

        for (int i = 0; i < posicion.length; i++) {
            System.out.print(posicion[i] + " ");
        }
    }
}
