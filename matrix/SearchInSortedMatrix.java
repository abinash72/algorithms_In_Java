package matrix;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {11,22,32,41},
                {14,26,37,45},
                {17,29,39,49}
        };
        search(matrix,26);
    }

    private static void search(int[][] arr, int val){
        int i=0, j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j] == val){
                System.out.println("Element found at row: "+i+" column: "+j+" | for Value "+val);
                return;
            }else if(arr[i][j] > val){
                j--;
            }else{
                i++;
            }
        }

        System.out.println("Element Not found.");
    }

    /*
    * Output :
    * if Element is present : Element found at row: 2 column: 1 for input value <val>
    * if Element is not present : Element Not Found*/
}
