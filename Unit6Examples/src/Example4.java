import java.util.Random;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rand = random.nextInt(10);

        System.out.println("Please guess a number between 1 and 10: ");
        int guess = scanner.nextInt();

        while (rand != guess){
            System.out.println("Wrong guess!");
            System.out.println("Guess again: ");
            guess = scanner.nextInt(10);

        }
        System.out.println("Congratulations you guessed the right number: " + guess);

    }
}
