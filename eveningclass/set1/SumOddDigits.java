import java.util.Scanner;

public class SumOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int digit;

      
        num = Math.abs(num);

        
        while (num > 0) {
            digit = num % 10;  
            if (digit % 2 != 0) { 
                sum += digit;
            }
            num /= 10; 
        }

        System.out.println("Sum of odd digits: " + sum);
        sc.close();
    }
}
