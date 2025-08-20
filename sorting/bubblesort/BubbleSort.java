package sorting.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,-1,0,-1,1};
        System.out.println("Before sorting : "+Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }

    private static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}
