import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private int numberToGuess;
    private int numberOfTries;

    public NumberGuessingGame() {
        Random random = new Random();
        this.numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        this.numberOfTries = 0;
    }

    public void playGame() {
        Scanner sc = new Scanner(System.in);
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!\nI have selected a number between 1 and 100\nTry to guess it!");
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int playerGuess = sc.nextInt();
            numberOfTries++;

            if (playerGuess < 1 || playerGuess > 100) {
                System.out.println("Please guess a number within the range of 1 to 100.");
            } else if (playerGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.printf("Congratulations! You've guessed the right number %d in %d tries.%n", numberToGuess, numberOfTries);
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        NumberGuessingGame obj = new NumberGuessingGame();
        obj.playGame();
    }
}