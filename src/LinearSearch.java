import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int target = 19;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int arr[], int target){
        if(arr.length==0){
            //return -1;
            //if -1 might be one of the element so return max value
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        //return -1;
        //if -1 might be one of the element so return max value
        return Integer.MAX_VALUE;
    }
}
