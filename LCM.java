import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    int a,b,k;
    System.out.print("Enter the two numbers: ");
    int n = in.nextInt();
    int m = in.nextInt();
    a=n;
    b=m;
    while(b!=0) {
      k=b;
      b=a%b;
      a=k;
    }
    System.out.print((n*m)/a);
  }
}
