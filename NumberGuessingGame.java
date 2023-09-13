import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int numberOfGuesses = 5;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". You have " + numberOfGuesses + " guesses.");
        
        for (int i = 1; i <= numberOfGuesses; i++) {
            System.out.print("Guess #" + i + ": ");
            int guess = scanner.nextInt();
            
            if (guess == randomNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number " + randomNumber + " in " + i + " guesses.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Try higher.");
            } else {
                System.out.println("Try lower.");
            }
        }
        
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've run out of guesses. The correct number was: " + randomNumber);
        }
        
        scanner.close();
    }
}
