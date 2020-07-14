import java.util.Scanner;

public class Amstrong {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the number: ");
    int n = in.nextInt();
    int r,m=0,k;
    k=n;
    while(n>0) {
      r=n%10;
      n=n/10;
      m=m+(r*r*r);
    }
    if (k==m) {
      System.out.print(k+" is a amstrong number");
    } else {
      System.out.print(k+" is not a amstrong number");
    }
  }
}
