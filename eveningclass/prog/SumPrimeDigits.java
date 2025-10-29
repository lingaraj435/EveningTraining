import java.util.Scanner;

public class SumPrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int digit;

       
        while (num > 0) {
            digit = num % 10; 
            if (isPrimeDigit(digit)) {
                sum += digit;
            }
            num /= 10; 
        }

        System.out.println("Sum of prime digits: " + sum);
        sc.close();
    }

 
    public static boolean isPrimeDigit(int d) {
        return (d == 2 || d == 3 || d == 5 || d == 7);
    }
}
