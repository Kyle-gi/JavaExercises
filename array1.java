package JavaExercises;

import java.util.Scanner;

public class array1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insertar 5 numeros!");

        int[] numeros = new int[5];
        int sum = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el siguente numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\n=== Results ===");
        System.out.print("Introduced numbers: ");
		for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + "  ");
            sum += numeros[i];
		}
        System.out.println("\n");
        System.out.print("The total sum of these numbers is: "  + sum);

        sc.close();
    }
}