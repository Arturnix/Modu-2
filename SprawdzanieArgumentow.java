import java.util.Scanner;

public class SprawdzanieArgumentow {

    static String getNumberFromUser() {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Type number: ");
       String input = scanner.nextLine();
       scanner.close();

       return input;
    }

    static void checkIsNumberZero() {
        String inputNumber = getNumberFromUser();
        Integer number = Integer.parseInt(inputNumber);
        if(number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
