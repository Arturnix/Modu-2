import java.util.Scanner;

public class WydrukowanieLiczb {

    public static void printRangeOfNumbers() {

        int rangeToPrint;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Provide range of numbers to print: ");
            rangeToPrint = scanner.nextInt();
            if(rangeToPrint < 0) {
                System.out.println("Provided number must be >= 0");
            }
        } while(rangeToPrint < 0);

        scanner.close();

        for(int i = 0; i <= rangeToPrint; i++) {
            System.out.print(i + " ");
        }
    }
}
