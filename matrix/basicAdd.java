
public class basicAdd {
    public static void main(String[] args) {
    

        int[][] A = {
            {5, 6},
            {7, 8}
        };

        int[][] B = {
            {1, 2},
            {3, 4}
        };

        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Result:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}

