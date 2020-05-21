import java.util.Scanner;

public class FinTheIndex {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the length of the array: ");
    int n = in.nextInt();
    System.out.print("Enter the array elements: ");
    int[] a = new int [n];
    for(int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }
    System.out.print("Enter the number to be searched: ");
    int m = in.nextInt();
    int sum = 0;
    for(int i=0; i<n; i++) {
      if(m==a[i]) {
        sum = i;
        System.out.print(sum+" ");
      }
    }
  }
}
