import java.util.Scanner;

public class MultiplyFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        
        float product = num1 * num2;

        
        System.out.println("Product: " + product);

        sc.close();
    }
}
