import java.util.Scanner;

public class ArraySubtitute{
 public static void main (String[] args) {
  Scanner input = new Scanner (System.in);
  System.out.print("How many times: ");
  int n = input.nextInt();
  int[] a = new int[n];
  System.out.print("Enter the array elements: ");
  int sum = 0, temp = 0;
  for (int i=0; i<n; i++) {
   a[i] = input.nextInt();
   sum = sum + a[i];
  }
  for (int i=0; i<n; i++) {
   System.out.print("\n");
   System.out.print(a[i]+ "");
  }
  for (int i=0; i<n; i++) {
   for (int j=0; j<n; j++) {
    if (a[i] > a[j]) {
     temp = a[i];
     a[i] = a[j];
     a[j] = temp;
    }
   }
  }
  Array (n,sum,a);
 }
 public static void Array (int n, int sum, int a[]) {
  int[] b = new int[n];
  int output = 0;
  for (int x=0; x<n; x++) {
   int element = a[x];
   int sum1 = 0;
   for (int j=0; j<n; j++) {
    b[j] = element;
    sum1 = sum1 + b[j];
   }
   if (sum1 > sum) {
    System.out.print("\n");
    output = element;
    break;
   }
  }
  System.out.print("\n");
  System.out.print("output"+ output);
 }
}
