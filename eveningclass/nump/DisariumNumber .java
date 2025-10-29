class DisariumNumber {
    public static void main(String[] args) {
        int n = 135, temp = n, sum = 0;
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            sum = sum + (int) Math.pow(d, i + 1);
        }

        if (sum == n)
            System.out.println(n + " is Disarium");
        else
            System.out.println(n + " is Not Disarium");
    }
}