import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secretNumber = random.nextInt(100) + 1; // 1 dan 100 gacha
        int points = 100;
        System.out.println("You neet to choose a number between 1 to 100");
        while (points > 0) {
            System.out.print("Guess: ");
            int guess = scanner.nextInt();
            if (guess > secretNumber) {
                System.out.println("Lower!");
                points -= 10;
            } 
            else if (guess < secretNumber) {
                System.out.println("Higher!");
                points -= 10;
            } 
            else {
                System.out.println("Correct # ");
                System.out.println("Final Score:" + points);
                break;
            }
        }
        if (points == 0) {
            System.out.println("You Lose?");
        }
        scanner.close();
    }
}
