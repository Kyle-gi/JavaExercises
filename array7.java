package JavaExercises;

public class array7 {
    public static void main(String[] args){

        int [] numeros = {5, -3, 0, 12, -7, 0, 25, -1, 0, 8, -4, 0, 15, -9, 0, 22, -6, 0, 31, -2, 0, 18, -5, 0, 11, -8, 0, 29, -10, 0};
        int positive = 0;
        int negative = 0;
        int nothing = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
               positive++;

            }
            else if (numeros[i] < 0){
                negative++;
            }
            else if (numeros[i] == 0){
                nothing++;
            }
        }

        System.out.println("Numeros positivos: " + positive);
        System.out.println("Numeros negativos: " + negative);
        System.out.println("Numeros nulos: " + nothing);
    }
}
