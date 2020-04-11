import java.util.Scanner;

public class ArrayCompare {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Length of array A: ");
    int n = input.nextInt();
    System.out.print("Length of array B: ");
    int m = input.nextInt();
    int[] a = new int[n];
    int[] b = new int[m];
    System.out.print("Arrary A: ");
    for(int i=0; i<n; i++) {
      a[i] = input.nextInt();
    }
    System.out.print("Array B: ");
    for (int i=0; i<m; i++) {
      b[i] = input.nextInt();
    }
    System.out.print("\n");
    int temp=0, flag=0;
    for(int i=0; i<m; i++) {
      for(int j=temp; j<n; j++) {
        if(b[i]!=a[j]) {
          temp=temp;
          flag=0;
          continue;
        } else {
          temp=j+1;
          flag=1;
          break;
        }
      }
      if (flag==0) {
        System.out.print("False");
      }
    }
    if (flag==1) {
      System.out.print("True");
    }
  }
}
