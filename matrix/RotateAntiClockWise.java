package matrix;

public class RotateAntiClockWise {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        //printing the matrix before rotating
        System.out.println("Matrix Before Rotation: ");
        for(int[] row : matrix){
            for(int col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

        //rotating the matrix
        rotateMatrix(matrix);

        // Printing the rotated matrix
        System.out.println("Matrix After Rotation: ");
        for(int[] row : matrix){
            for(int col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrix(int[][] matrix){
        int n = matrix.length;

        // First we need to get the transpose of the matrix
        for(int row=0; row<n; row++){
            for(int col=0; col<row; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        //Now we need to reverse each column of the matrix
        for(int col=0;col<n; col++){
            int low=0, high=n-1;
            while(low<high){
                int temp = matrix[low][col];
                matrix[low][col] = matrix[high][col];
                matrix[high][col] = temp;
                low++;
                high--;
            }
        }
    }
    /*
    * Output :
    * Matrix Before Rotation:
        1 2 3
        4 5 6
        7 8 9
      Matrix After Rotation:
        3 6 9
        2 5 8
        1 4 7
*/
}
