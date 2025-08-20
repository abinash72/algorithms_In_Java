package sorting.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,-1,0,-1,1};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
        int[] ans = mergesort(arr);
        System.out.println("After sorting : "+Arrays.toString(ans));
    }

    private static int[] mergesort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length/2;
        int[] first = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] second = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,second);
    }

    private static int[] merge(int[] first, int[] second){
        int i=0,j=0,k=0;
        int[] newarr = new int[first.length + second.length];

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                newarr[k] = first[i];
                i++;
                k++;
            }else{
                newarr[k] = second[j];
                j++;
                k++;
            }
        }

        while(i < first.length){
            newarr[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            newarr[k] = second[j];
            j++;
            k++;
        }

        return newarr;
    }
}
