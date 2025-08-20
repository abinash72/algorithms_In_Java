package sorting.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,-1,0,-1,1};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        selectionsort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }

    // Here we have used the max element to sort the array we can also use min element to do the same
    private static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int end = n-1-i;
            int maxIndx = findMaxIndx(arr,end);
            int temp = arr[end];
            arr[end] = arr[maxIndx];
            arr[maxIndx] = temp;
        }
    }

    private static int findMaxIndx(int[] arr, int end){
        int maxIndx= 0;
        for(int i=1; i<=end; i++){
            if(arr[i] > arr[maxIndx]) maxIndx = i;
        }
        return maxIndx;
    }

}
