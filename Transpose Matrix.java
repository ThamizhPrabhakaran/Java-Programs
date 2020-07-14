import java.util.Scanner;

public class Transpose {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the rows and columns: ");
    int r = in.nextInt();
    int c = in.nextInt();
    System.out.print("Enter the matrix elements: ");
    int[][] a = new int[r][c];
    for(int i=0; i<r; i++) {
      for(int k=0; k<c; k++) {
        a[i][k] = in.nextInt();
      }
      System.out.print("\n");
    }
    System.out.println("The matrix: ");
    for(int i=0; i<r; i++) {
      for(int j=0; j<c; j++) {
        System.out.print(a[i][j]+ " ");
      }
      System.out.print("\n");
    }
    System.out.println("Transpose of matrix: ");
    for(int i=0; i<r; i++) {
      for(int j=0; j<c; j++) {
        System.out.print(a[j][i]+ " ");
      }
      System.out.print("\n");
    }
  }
}
