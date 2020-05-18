import java.util.Scanner;

public class HighThree {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the no.of buildings: ");
    int n = in.nextInt();
    System.out.print("Enter the array of elements: ");
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = in.nextInt();
    }
    int temp = 0;
    for(int i=0; i<n; i++) {
      for(int j=i+1; j<n; j++) {
        if(a[i]>a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    int max = a[n-1];
    int max1 = a[n-2];
    int max2 = a[n-3];
    System.out.print("The highest three buildings are: "+ max+","+max1 +" and "+max2);
  }
}
