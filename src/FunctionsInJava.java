import java.util.Arrays;

public class FunctionsInJava {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,5, 7, 8, 90};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
