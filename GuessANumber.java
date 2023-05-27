import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);
        while (true) {
            System.out.println("Guess a number (0-100):");
            String playerMove = scanner.nextLine();
            boolean isValid = true;
            for (int i = 0; i < playerMove.length(); i++) {
                if (!Character.isDigit(playerMove.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
            int playerNumber = 0;
            if (isValid) {
                playerNumber = Integer.parseInt(playerMove);
                if (playerNumber < 0 || playerNumber > 100) {
                    isValid = false;
                }
            }

            if (isValid) {
                if (playerNumber < computerNumber) {
                    System.out.println("Too Low");
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too High");
                } else {
                        System.out.println("You guessed it!");
                        break;
                }
            } else {
                System.out.println("Please, enter a valid number (0-100):");
            }
        }
    }
}