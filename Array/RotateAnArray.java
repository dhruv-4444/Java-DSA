import java.util.*;
public class RotateAnArray {
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int n=arr.size();
        int rotate=3;

        rotate%=n;

        Collections.reverse(arr.subList(0,rotate));
        Collections.reverse(arr.subList(rotate,n));
        Collections.reverse(arr);


        arr.forEach((x)->System.err.print(x+ " "));

        }
    
}
