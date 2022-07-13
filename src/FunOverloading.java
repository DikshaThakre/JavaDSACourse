import java.util.Arrays;

public class FunOverloading {
    public static void main(String[] args) {
        //fun(67);
        //fun("diksha");
        //demo(); //Ambiguity
        demo(2, 5, 6, 9, 55);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
