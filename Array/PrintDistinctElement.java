import java.util.ArrayList;
import java.util.TreeSet;

public class PrintDistinctElement {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(12);
        arr.add(10);
        arr.add(9);
        arr.add(45);
        arr.add(2);
        arr.add(2);
        arr.add(12);
        arr.add(45);

        TreeSet<Integer> s=new TreeSet<>(arr);
        s.forEach((x)->System.err.print(x+" "));
    }
    
}
