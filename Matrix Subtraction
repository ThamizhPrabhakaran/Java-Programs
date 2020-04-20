import java.util.Scanner;

public class Sub {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the rows and columns: ");
    int r = in.nextInt();
    int c = in.nextInt();
    System.out.print("A = ");
    int[][] a = new int[r][c];
    for(int i=0; i<r; i++) {
      for(int k=0; k<c; k++) {
        a[i][k] = in.nextInt();
      }
      System.out.print("\n");
    }
    System.out.print("Enter the rows and columns: ");
    int r1 = in.nextInt();
    int c1 = in.nextInt();
    System.out.println("B = ");
    int[][] b = new int[r1][c1];
    for(int i=0; i<r1; i++) {
      for(int j=0; j<c1; j++) {
        b[i][j] = in.nextInt();
      }
      System.out.print("\n");
    }
    System.out.println("Sum of matrix: ");
    if((r1&c1)==(r&c)) {
      for(int i=0; i<r; i++) {
        for(int j=0; j<c; j++) {
          System.out.print(a[i][j]-b[i][j]+ " ");
        }
        System.out.print("\n");
      }
    }else{
      System.out.print("Cannot be done because rows and columns should be same");
    }
  }
}
