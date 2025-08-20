package linearsearch;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,3,18,58,78,32};
        System.out.println(linearSearch(arr,3));
    }

    private static int linearSearch(int[] arr, int value){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == value) return i;
        }
        return -1;
    }
}
