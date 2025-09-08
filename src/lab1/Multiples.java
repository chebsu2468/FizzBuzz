package lab1;

public class Multiples {
    public static int main(int n, int a, int b) {

        return multiples(n, a, b);
    }

    public static int multiples(int n, int a, int b ) {
        int count = 0;
        for (int i= 0; i <= n; i++) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {
                System.out.println(i);
                count ++;
            }

        }
        return count;
    }
}
