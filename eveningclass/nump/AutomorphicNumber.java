class AutomorphicNumber {
  public static void main(String[]args) {
    int n = 25;
    int sq = n * n;
    if (sq % 100 == n)  
     System.out.println(n + "is Automorphic");
  else
     System.out.println(n + "is Not Automorphic");
   }
}