package JavaExercises;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insertar 5 numeros!");

        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el siguente numero:");
            numeros[i] = sc.nextInt();
        }

		for (int i = 0; i < numeros.length; i++){
			System.out.println(numeros[i]);
		}
		System.out.println();
        sc.close();
    }
}