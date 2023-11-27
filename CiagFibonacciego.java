public class CiagFibonacciego {

    public static void fibonacciSequence(int howManyElements) {

            if(howManyElements <= 0) {
                System.out.println("Provide number > 0");
                System.exit(0);
            }

            int[] fibonacciElements = new int[howManyElements];

            System.out.print(0 + ", ");
            fibonacciElements[0] = 0;
            System.out.print(1 + ", ");
            fibonacciElements[1] = 1;
            for (int i = 2; i < howManyElements; i++) {
                fibonacciElements[i] = fibonacciElements[i - 1] + fibonacciElements[i - 2];
                System.out.print(fibonacciElements[i] + ", ");
            }
        }
    }
