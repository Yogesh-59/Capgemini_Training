import java.util.Scanner;
public class MaximumOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int num1 = getInput(scanner);
        int num2 = getInput(scanner);
        int num3 = getInput(scanner);

        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Function to take input from the user
    private static int getInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Function to calculate the maximum of three numbers
    private static int findMaximum(int num1, int num2, int num3) {
        int max = num1; // Assume num1 is the maximum initially
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
