import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayConcepts {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5]; //Datatype[] reference_variable = new DataType[size];
        String[] str = new String[4];

        //input using for loops
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }

        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

//        for(int num : arr){ //for every element in array, print the element
//            System.out.print(num + " "); //here num represents the element of the array
//        }

        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
    }
}
