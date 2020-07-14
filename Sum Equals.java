import java.util.Scanner;

public class SumEqu {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the sum: ");
    int sum = in.nextInt();
    System.out.print("Enter the array length: ");
    int n = in.nextInt();
    System.out.print("Enter the array elements: ");
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }
    int sum1 = 0;
    int count = 0;
    for(int i=0; i<n; i++) {
      for(int j=i+1; j<n; j++) {
        sum1 = a[i]+a[j];
        if(sum==sum1) {
            count=count+1;
        }
      }
    }
    System.out.print(count);
  }
}
