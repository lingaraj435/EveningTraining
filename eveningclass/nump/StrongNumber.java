class StrongNumber {
    public static void main(String[] args) {
        int n = 145, temp = n, sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++)
                fact = fact * i;
            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == n)
            System.out.println(n + " is Strong");
        else
            System.out.println(n + " is Not Strong");
    }
}