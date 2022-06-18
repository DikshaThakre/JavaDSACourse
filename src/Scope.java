public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Diksha";

        {
            //int a = 78;  //already initialised outside the block in the same method, hence cannot be initialised again.
            int c = 99;
            a = 95; //reassign the origin ref variable to some other value
            System.out.println(a);
            name = "poonam";
            System.out.println(name);
            //values initialised in this block, will remain in block
        }
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);  //cannot use outside the block
    }
    static void random(){
        int num = 67;
        System.out.println(num);
    }
}
