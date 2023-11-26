import java.util.Scanner;

public class Srednia3Liczb {

/*    static double calculateMeanValue() {
        double sum = 0;
        double input;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            System.out.println("Type number: ");
            input = scanner.nextDouble();
            if(input < 0) {
            System.out.println("Number can't be < 0");
            return 0;
            }
            sum += input;
        }
        scanner.close();

        return sum/3;
    }*/

    static double calculateMeanValue() {

        double num1, num2, num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type number 1: ");
        num1 = scanner.nextDouble();
        System.out.println("Type number 2: ");
        num2 = scanner.nextDouble();
        System.out.println("Type number 3: ");
        num3 = scanner.nextDouble();
        scanner.close();

        if(num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Any number can't be < 0");
            return 0;
        } else {
            double sum = num1 + num2 + num3;
            return sum/3;
        }
    }

}
