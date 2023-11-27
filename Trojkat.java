import java.util.Scanner;

public class Trojkat {

    public static void printStarTriangle() {

        int triangleLevels;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Type number of levels to draw:");
            triangleLevels = scanner.nextInt();
            if(triangleLevels <= 0) {
                System.out.println("Number must be > 0");
            }
        } while (triangleLevels <= 0);

            for (int i = 1; i <= triangleLevels; i++) {
                for (int j = i; j > 0; j--) {
                    System.out.print('*');
                }
                System.out.println();
            }
    }
}
