package JavaExercises;

public class array8 {
    public static void main(String[] args){

        double[] secuencia = {2.5, -1.3, 4.7, 0.0, -3.8, 6.2, -0.5, 9.1, -7.4, 5.6, -2.9, 8.3, -4.1, 3.3, -6.7, 1.8, -0.9, 7.5, -5.2, 10.0};
        double numeros = secuencia[0];
        int posicion = 0;

        for (int i = 0; i < secuencia.length; i++){
            numeros = Math.max(numeros, secuencia[i]);
            posicion = i;
        }
        System.out.println("El máximo es: " + numeros + " en la posición: " + posicion);
    }
}
