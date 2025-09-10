package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(1));
    }

    public static int reduce(int a) {
        int count = 0;
        while (a > 0) {
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a--;
            }
            count++;
        }
        return count;
    }
}
