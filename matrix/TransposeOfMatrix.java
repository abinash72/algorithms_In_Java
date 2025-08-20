package matrix;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        transpose(arr);

        // PRINTING THE TRANSPOSED ARRAY
        for(int row =0; row < arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    // ONLY N x N MATRIX CAN BE TRANSPOSED IN THE BELOW METHOD
    private static void transpose(int[][] arr){
        for(int row =0; row<arr.length; row++){
            for(int col=0; col<row; col++){
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }
}
