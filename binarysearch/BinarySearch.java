package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {21,34,35,67,78,89,98,99};
        System.out.println(binarysearch(arr,20));
    }

    private static int binarysearch(int[] arr, int value){
        int start=0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end -start) /2 ;
            if(arr[mid] == value){
                return mid;
            }else if(arr[mid] < value){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        // If the element is absent then return -1
        return -1;
    }
}
