import java.util.*;

public class GenerateSubarray {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
            }
        }
    }

}
