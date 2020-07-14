import java.util.Scanner;

public class DesOrd {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the number: ");
    int n = in.nextInt();
    System.out.print("Enter the array: ");
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }
    int temp = 0;
    for(int i=0; i<n; i++) {
      for(int j=i+1; j<n; j++) {
        if(a[i]<a[j]) {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    System.out.print("Descending order: ");
    for(int i=0; i<n; i++) {
      System.out.print(a[i]+ " ");
    }
  }
}
