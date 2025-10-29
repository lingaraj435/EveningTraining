class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153, temp = n, sum = 0;

        while (temp > 0) {
            int d = temp % 10;
            sum = sum + (d * d * d);
            temp = temp / 10;
        }

        if (sum == n)
            System.out.println(n + " is Armstrong");
        else
            System.out.println(n + " is Not Armstrong");
    }
}