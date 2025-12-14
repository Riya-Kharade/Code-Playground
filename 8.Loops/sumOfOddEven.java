import java.util.*;

public class sumOfOddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        int n = sc.nextInt(); // number of elements

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt(); // read each integer

            if (num % 2 == 0) {
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;
            }
        }

        System.out.println("Sum of Even numbers: " + sumEven);
        System.out.println("Sum of Odd numbers: " + sumOdd);
    }
}
