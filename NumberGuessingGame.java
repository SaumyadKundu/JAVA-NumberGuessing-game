import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfAttempts = 5;
        int attemptsMade = 0;
        boolean hasWon = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You need to guess a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + numberOfAttempts + " attempts to guess the correct number.");

        while (attemptsMade < numberOfAttempts) {
            System.out.print("Enter your guess: ");
            int playerGuess = scanner.nextInt();
            attemptsMade++;

            if (playerGuess < lowerBound || playerGuess > upperBound) {
                System.out.println("Please enter a number within the range!");
                continue;
            }

            if (playerGuess == numberToGuess) {
                hasWon = true;
                break;
            } else if (playerGuess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            System.out.println("You have " + (numberOfAttempts - attemptsMade) + " attempts left.");
        }

        if (hasWon) {
            System.out.println("Congratulations! You guessed the right number: " + numberToGuess);
        } else {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
        }

        scanner.close();
    }
}
