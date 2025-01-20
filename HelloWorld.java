import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String n = sc.nextLine();
        System.out.println("You entered: " + n);

        sc.close();
    }
}
