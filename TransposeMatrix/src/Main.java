import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1 ,2 ,3},
                {4 ,5 ,6}
        };

        int n = matrix.length+1;
        int[][] transpose = new int[3][2];

        for (int i =0 ; i< n;i++){
            for (int j =0; j< n-1;j++){
                transpose[i][j] =matrix[j][i];
            }
        }

        System.out.print("Matrix : ");
        System.out.println(Arrays.deepToString( matrix));

        System.out.print("Transpose Matrix : ");
        System.out.println(Arrays.deepToString(transpose)+"\n");


        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<n-1 ; j++){
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
