package JavaExercises;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Insert 15 numbers | numeber " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        System.out.println("===REVERSE===");
        for (int j = numeros.length-1; j > 0; j--){
            System.out.print(numeros[j] + ", ");
        }

        System.out.println();

        System.out.println("===VERSE===");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + ", ");
        }
    }
}

