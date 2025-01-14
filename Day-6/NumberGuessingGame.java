import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateRandomGuess(low, high, random);
            System.out.println("Computer's guess: " + guess);

            String feedback = getUserFeedback(scanner);

            switch (feedback.toLowerCase()) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    guessedCorrectly = true;
                    System.out.println("Hooray! The computer guessed your number.");
                    break;
                default:
                    System.out.println("Invalid feedback. Please respond with 'high', 'low', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Something went wrong. Are you sure your feedback was accurate?");
                break;
            }
        }
    }

    // Function to generate a random guess within the given range
    private static int generateRandomGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }

    // Function to get user feedback on the computer's guess
    private static String getUserFeedback(Scanner scanner) {
        System.out.print("Is the guess 'high', 'low', or 'correct'? ");
        return scanner.nextLine().trim();
    }
}
