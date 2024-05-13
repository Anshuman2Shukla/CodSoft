import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between " + minRange + " and " + maxRange + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        
        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            while (!guessedCorrectly && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
                    guessedCorrectly = true;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            totalAttempts += attempts;
            rounds++;
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thanks for playing! Your total score:");
        System.out.println("Rounds played: " + rounds);
        System.out.println("Total attempts: " + totalAttempts);
        
        scanner.close();
    }
}
