import java.util.Scanner;

public class SumEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int digit;

        // Handle negative numbers
        num = Math.abs(num);

        // Loop through digits
        while (num > 0) {
            digit = num % 10; // Get last digit
            if (digit % 2 == 0) { // Check even digit
                sum += digit;
            }
            num /= 10; // Remove last digit
        }

        System.out.println("Sum of even digits: " + sum);
        sc.close();
    }
}
