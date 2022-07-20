import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //int arr[] = {9, -56, -9, 0, 8}; //checking for edge cases
        int arr[] = {5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                swap(arr, j, j-1);
            }
        }
    }

    static void swap(int[] arr, int start, int end){
        if(arr[start] < arr[end]){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
    }
}
