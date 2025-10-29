class HarshadNumber {
    public static void main(String[] args) {
        int n = 18, sum = 0, temp = n;

        while (temp > 0) {
            int d = temp % 10;
            sum = sum + d;
            temp = temp / 10;
        }

        if (n % sum == 0)
            System.out.println(n + " is Harshad");
        else
            System.out.println(n + " is Not Harshad");
    }
}