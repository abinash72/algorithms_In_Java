package matrix;

public class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 17},
                {5, 6, 7, 8, 18},
                {9, 10, 11, 12, 19},
                {13, 14, 15, 16, 20}
        };
        spiralTraversal(arr);
    }

    private static void spiralTraversal(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int topRow =0 , bottomRow = row-1;
        int rightCol =col-1 , leftCol =0;
        while(topRow <= bottomRow && leftCol <= rightCol){
            // Outer Boundary from left to right from top
            for(int i=leftCol; i<=rightCol; i++) System.out.print(matrix[topRow][i]+" ");
            topRow++;

            // Outer Boundary from top to bottom from right
            for(int i=topRow; i<=bottomRow; i++) System.out.print(matrix[i][rightCol]+" ");
            rightCol--;

            // Outer Boundary from right to left from bottom
            if(topRow <= bottomRow){
                for(int i=rightCol; i>=leftCol; i--) System.out.print(matrix[bottomRow][i]+" ");
                bottomRow--;
            }

            // Outer Boundary from bottom to top from left
            if(leftCol <= rightCol){
                for(int i=bottomRow; i>=topRow; i--) System.out.print(matrix[i][leftCol]+" ");
                leftCol++;
            }

        }
    }

    /*
    * Output : 1 2 3 4 17 18 19 20 16 15 14 13 9 5 6 7 8 12 11 10 */
}
