import java.util.Scanner;

public class NajmniejszaLiczba {

    /*public static double lowestValue() {

        Scanner scanner = new Scanner(System.in);

        double nextInputNumber;
        double lowestValue;

        System.out.println("Type number");

        lowestValue = scanner.nextDouble();

        for(int i = 0; i < 4; i++) {
            System.out.println("Type number");
            nextInputNumber = scanner.nextDouble();
           if(nextInputNumber < lowestValue) {
               lowestValue = nextInputNumber;
           }
        }

        scanner.close();

        return lowestValue;
    }*/

    static double lowestValue;
    public static void lowestValueArray() {

        double[] inputNumber = new double[5];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Type number: ");
            inputNumber[i] = scanner.nextDouble();
        }

        lowestValue = inputNumber[0];
        for(int i = 1; i < inputNumber.length; i++) {
            if(inputNumber[i] < lowestValue) {
                lowestValue = inputNumber[i];
            }
        }
        scanner.close();
        System.out.println(lowestValue);
    }
}
