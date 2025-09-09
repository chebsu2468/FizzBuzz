package lab1;

public class Multiples {
    public static void main(String[] arg) {
        int n = 1000;
        int a = 3;
        int b = 5;
        multiples(n, a, b);
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {

                count++;
            }

        }
        System.out.println(count);
        return count;
    }
}
