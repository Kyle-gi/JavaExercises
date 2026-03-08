package JavaExercises;

public class array9 {
    public static void main(String[] args){

        int[] pares = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int posicion = 0;
        int resultado = 0;

        for (int i = 0; i < pares.length; i++){
            posicion = i;
            if (posicion % 2 == 0){
                resultado = resultado + pares[i];
            }
        }
        System.out.println(resultado);
    }
}
