import java.util.Scanner;
public class BinAd {
   public static void main(String[] args) {
	   long b1, b2;
	   int i = 0, rem = 0;
	   int[] sum = new int[10];
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Enter first binary number: ");
	   b1 = scanner.nextLong();
	   System.out.print("Enter second binary number: ");
	   b2 = scanner.nextLong();
	   scanner.close();
	   while (b1 != 0 || b2 != 0) {
		   sum[i++] = (int)((b1 % 10 + b2 % 10 + rem) % 2);
		   rem = (int)((b1 % 10 + b2 % 10 + rem) / 2);
		   b1 = b1 / 10;
		   b2 = b2 / 10;
	  }
	  if (rem != 0) {
		  sum[i++] = rem;
	  }
	  --i;
	  System.out.print("Output: ");
	  while (i >= 0) {
		  System.out.print(sum[i--]);
	  }
	  System.out.print("\n");  
   }
}
