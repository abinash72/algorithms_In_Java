package matrix;

public class MatrixBoundaryTraversal {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {0,0,0,0}
        };
        matrixboundarytraversal(arr);
    }

    private static void matrixboundarytraversal(int[][] arr){
        int row = arr.length;

        if(row == 1){
            for(int i=0; i<arr[row].length; i++){
                System.out.print(arr[0][i]+" ");
            }
        }else{
            for(int i=0; i < arr[0].length; i++){
                System.out.print(arr[0][i]+" ");
            }
            for(int i = 1; i < row; i++){
                System.out.print(arr[i][arr[i].length-1]+" ");
            }

            for(int i = arr[row-1].length-2;i>=0; i--){
                System.out.print(arr[row-1][i]+" ");
            }
            for(int i= row-2; i>=1; i--){
                System.out.print(arr[i][0]+" ");
            }
        }
    }
}
