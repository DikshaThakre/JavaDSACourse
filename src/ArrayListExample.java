import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(67);
        list.add(6778);
        list.add(33);
        list.add(92);
        list.add(556);
        list.add(43);
        list.add(323);

        //System.out.println(list.contains(67));
        list.set(1,99);
        list.remove(0);
        System.out.println(list);
    }
}
