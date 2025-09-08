package lab1;

public class Multiples {
    public static int main(int a, int b, int n) {

        return multiples(1000, 3, 5);
    }

    public static int multiples(int n, int a, int b ) {
        int count = 0;
        for (int i= 0; i <= n; i++) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = n % a == 0;
            boolean divisibleBy5 = n % b == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {
                System.out.println(n);
                count ++;
            }

        }
        return count;
    }
}
