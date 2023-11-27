import java.util.Scanner;

public class SumowanieLiczb {

    static int sum;
    public static void sumNumbers() {

        int rangeToSum;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Provide range of numbers to sum: ");
            rangeToSum = scanner.nextInt();
            if (rangeToSum < 0) {
                System.out.println("Provided number must be >= 0");
            }
        } while (rangeToSum < 0);

        scanner.close();

        for (int i = 0; i <= rangeToSum; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
