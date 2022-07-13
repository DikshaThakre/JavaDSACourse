import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(2, 4, 7, 8, 5, 39);
        multiple(2,3, "Diksha","Sak","Devid","Nick");
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
