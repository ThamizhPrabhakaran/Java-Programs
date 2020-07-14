import java.util.Scanner;

public class GcdA {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the numbers: ");
    int n = in.nextInt();
    int m = in.nextInt();
    System.out.print("Greatest Common Factor of "+n+" and "+m+" is: "+gcd(n,m));
  }
  public static int gcd (int n, int m) {
    if(n == 0 || m == 0) {
      return 0;
    }
    if(n == m) {
      return n;
    }
    if(n > m) {
      return gcd(n-m,m);
    }else{
      return gcd(n,m-n);
    }
  }
}
