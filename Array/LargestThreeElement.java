import java.util.*;

public class LargestThreeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        int tl = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > sl && arr[i] < l) {
                sl = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > tl && arr[i] < sl) {
                tl = arr[i];
            }
        }
        int[] ans = new int[3];
        ans[0] = l;
        ans[1] = sl;
        ans[2] = tl;
        for (int i = 0; i < 3; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
