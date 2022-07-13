import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestLargestInArray {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = ac.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ac.nextInt();
        }
        System.out.println("Enter Kth value");
        int k = ac.nextInt();
        System.out.println("Kth smallest value: "+KthSmallest(arr,k));
    }
        public static int KthSmallest(int arr[],int k){
            Arrays.sort(arr);
            return arr[k-1];
        }
}

