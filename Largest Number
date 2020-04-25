import java.util.Scanner;

public class LargNum {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the length of the array: ");
    int n = in.nextInt();
    System.out.print("Enter the array elements: ");
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }
    int temp = 0;
    for(int i=0; i<n; i++) {
      for(int j=i+1; j<n; j++) {
        if(a[i]>a[j]) {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    int max = a[n];
    System.out.print(a[n]);
  }
}
