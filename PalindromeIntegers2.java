import java.util.Scanner;

public class PalindromeIntegers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        isPalindromeInteger(scanner, input);
    }

    private static void isPalindromeInteger(Scanner scanner, String input) {
        while (!input.equals("END")) {
            StringBuilder firstInput = new StringBuilder(input);
            StringBuilder reversedInput = new StringBuilder(firstInput);
            reversedInput = reversedInput.reverse();
            if (firstInput.toString().equals(reversedInput.toString())) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }
}