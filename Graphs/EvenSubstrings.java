public class EvenSubstrings {

    public static int countEvenSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (Integer.parseInt(substring) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "1232";
        int numEvenSubstrings = countEvenSubstrings(str);
        System.out.println("Number of even substrings in '" + str + "': " + numEvenSubstrings);
    }
}