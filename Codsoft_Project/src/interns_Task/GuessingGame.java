package interns_Task;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int totalAttempts = 0;

        while (true) 
        {
            int numberToGuess = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Round " + (rounds + 1) + "r̥:");
            System.out.println("Guess the number between " + min + " and " + max);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + numberToGuess);
            }

            rounds++;
            System.out.print("Do you want to play another round? (yes/no): ");
            scanner.nextLine();  // consume the newline
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Game Over!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Total attempts: " + totalAttempts);
        System.out.println("Average attempts per round: " + ((double) totalAttempts / rounds));
    }
}

