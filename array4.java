package JavaExercises;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++){ //this loop starts from here matriz[0][1]
            for (int j = 0; j < matriz[i].length;j++){ //This loop starts from here [1][0]
                if (i % 2 == 0){
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
