package JavaExercises;

public class array5 {
    public static void main(String[] args) {

        int[][] diagonal = new int[5][5];

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
