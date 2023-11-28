import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

        public void start() {

            System.out.println("Welcome! This is calculator app.\nType two numbers to perform calculation");

            do {
                System.out.println("Type 1st number: ");
                int a = getNumberFromUser();
                // scanner.nextLine();
                // zrobić nextline zmiast nextInt i przerzucic string na int

                System.out.println("Type 2nd number: ");
                int b = getNumberFromUser();
                // scanner.nextLine();
                // zrobić nextline zmiast nextInt i przerzucic string na int

                System.out.println("Type symbol of operation to perform calculation:\n+ add\n- substract\n/ divide\n* multiply");
                System.out.println("-------------------------------\nType operation symbol:");
                scanner.skip("\\R?");
                String operation = getOperationFromUser();

                while (!(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*"))) {
                    System.out.println("Type correct operation symbol: ");
                    operation = getOperationFromUser();
                }

                switch (operation) {
                    case "+":
                        System.out.println("Adding result: " + add(a, b));
                        break;
                    case "-":
                        System.out.println("Subtraction result: " + subtract(a, b));
                        break;
                    case "/":
                        if(!isMoreThan0(b)) {
                            System.out.println("Division result: no division by 0");
                        } else {
                            System.out.println("Division result: " + divide(a, b));
                        }
                        break;
                    case "*":
                        System.out.println("Multiplication result: " + multiply(a, b));
                        break;
                }

                System.out.println("\nType 'exit' to close the calculator or any other key to start again:");

            } while(!(getOperationFromUser().equals("exit")));
            scanner.close();
        }

        private String getOperationFromUser() {
            return scanner.nextLine();
        }

        private int getNumberFromUser() {
            return scanner.nextInt();
        }

        private boolean isMoreThan0(int number) {
            if(number != 0){
                return true;
            }
            return false;
        }

        private int add(int a, int b) {
            return (a + b);
        }

        private int subtract(int a, int b) {
            return (a - b);
        }

        private int divide(int a, int b) {
            return (a / b);
        }

        private int multiply(int a, int b) {
            return (a * b);
        }
    }

