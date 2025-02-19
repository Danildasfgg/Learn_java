import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String action;
        int result;
        do {
            System.out.println("Hello. This is my first calculator on Java. Write an action (add, subtract, multiply, divide) or 'stop' to exit:");
            action = scanner.nextLine();
            if (action.equals("stop")){
                break;
            }
            System.out.println("Write one number");
            int number_one = scanner.nextInt();
            System.out.println("write two number");
            int number_two = scanner.nextInt();
            scanner.nextLine();

            if (action.equals("add")){
                result = number_one + number_two;
            } else if (action.equals("subtract")) {
                result = number_one - number_two;
            } else if (action.equals("multiply")) {
                result = number_one * number_two;
            } else if (action.equals("divide")) {
                if (number_two == 0){
                    System.out.println("Division by zero!");
                    continue;
                } else {
                    result = number_one / number_two;
                }
            } else {
                System.out.println("Unknown action. Please try again");
                continue;
            }
            System.out.println("Result: " + result);
        }
        while (!action.equals("stop"));

        System.out.println("Calculator is closed");
        scanner.close();
    }
}