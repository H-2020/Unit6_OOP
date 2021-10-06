import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text please ");
        String text = scanner.nextLine();

        System.out.println(reverse(text));

    }
    public static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        return stringBuilder.reverse().toString();
    }
}
