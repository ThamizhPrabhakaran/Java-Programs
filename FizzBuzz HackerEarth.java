import java.util.Scanner;

public class FizBuz {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("No.of Testcases: ");
    int T = in.nextInt();
    int[] a = new int[T];
    System.out.print("Enter the elements: ");
    for(int i=0; i<T; i++) {
      a[i] = in.nextInt();
    }
    for(int i=0; i<T; i++) {
      for (int j=1; j<=a[i]; j++) {
        if((j%3)==0) {
          System.out.print("Fizz");
        }
        if((j%5)==0){
          System.out.print("Buzz");
        }
        if(((j%3)!=0)&&((j%5)!=0)) {
          System.out.print(j);
        }
        System.out.print("\n");
      }
    }
  }
}
