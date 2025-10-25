import java.util.Scanner;

public class OddEvenCheckerV2 {

    // Method to check if a number is even or odd
    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return number + " is Even.";
        } else {
            return number + " is Odd.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Call the method and display result
        System.out.println(checkOddEven(num));

        scanner.close();
    }
}
