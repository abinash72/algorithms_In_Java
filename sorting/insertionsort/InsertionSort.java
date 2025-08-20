package sorting.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,-1,0,-1,1};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        insertionsort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }

    private static void insertionsort(int[] arr){
        int n = arr.length;
        if(n <2) return;
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    // if the previous element is smalled than teh current it means all the elements present on the left side aare also smaller
                    // So no need of traversing and checking all of them
                    break;
                }
            }
        }
    }
}
