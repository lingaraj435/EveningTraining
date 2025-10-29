class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121, temp = n, rev = 0;

        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }

        if (rev == n)
            System.out.println(n + " is Palindrome");
        else
            System.out.println(n + " is Not Palindrome");
    }
}