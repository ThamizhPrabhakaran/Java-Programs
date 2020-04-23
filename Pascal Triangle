import java.util.Scanner;

public class PascalTri {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter number of lines: ");
    int n = in.nextInt();
    int s = n;
    int re = 1;
    for (int i=0; i<n; i++) {
      for(int j=1; j<=s; j++) {
        System.out.print(" ");
      }
      re = 1;
      for(int k=0; k<=i; k++) {
        System.out.print(re + " ");
        re = re * (i-k)/(k+1);
      }
      s--;
      System.out.print("\n");
    }
  }
}
