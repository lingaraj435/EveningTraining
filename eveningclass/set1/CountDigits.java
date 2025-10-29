import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        // Handle zero case
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp /= 10;  // Remove last digit
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " is: " + count);

        sc.close();
    }
}
