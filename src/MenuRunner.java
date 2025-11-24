import java.util.Scanner;
public class MenuRunner {
    //working with if else statement and getting inputs
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int number1 = input.nextInt();

        System.out.print("Enter Number2: ");
        int number2 = input.nextInt();

        System.out.println("Choices Available are ");
        System.out.println("1. Add Number");
        System.out.println("2. Subtract Number");
        System.out.println("3. Multiply Number");
        System.out.println("4. Divide Number");

        System.out.print("Enter Choice: ");
        int choice = input.nextInt();

        System.out.println("Your choice are ");
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
        System.out.println("Choice: " + choice);

        performOperationWithIfElse(number1, number2, choice);
        performOperationWithSwitch(number1, number2, choice);
    }

    static void performOperationWithIfElse(int number1, int number2, int choice) {
        if(choice == 1) {
            System.out.println("Result: " + (number1 + number2));
        } else if(choice == 2) {
            System.out.println("Result: " + (number1 - number2));
        } else if(choice == 3) {
            System.out.println("Result: " + (number1 * number2));
        } else if (choice == 4) {
            System.out.println("Result: " + (number1 / number2));
        } else {
            System.out.println("Invalid Operation");
        }
    }

    static void performOperationWithSwitch(int number1, int number2, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
                case 4:
                    System.out.println("Result: " + (number1 / number2));
                    break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
    }

}
