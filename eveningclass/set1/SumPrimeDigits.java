import java.util.Scanner;

public class SumPrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int digit;

        // Extract digits and check if prime
        while (num > 0) {
            digit = num % 10; // get last digit
            if (isPrimeDigit(digit)) {
                sum += digit;
            }
            num /= 10; // remove last digit
        }

        System.out.println("Sum of prime digits: " + sum);
        sc.close();
    }

    // Function to check if a digit is prime
    public static boolean isPrimeDigit(int d) {
        return (d == 2 || d == 3 || d == 5 || d == 7);
    }
}
