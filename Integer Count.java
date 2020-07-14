import java.util.Scanner;
 
public class IntCount {  
   public static void main (String[] args) {
     Scanner in = new Scanner (System.in);
     System.out.print("Enter the two numbers: ");
     int a = in.nextInt();
     int b = in.nextInt();
     int sum = 0;
     sum = a+b;
     int sum1 = 0, rem = 0, count = 0;
     while (sum>0) {
       rem=sum%10;
       sum1=(sum1*10)+rem;
       count=count+1;
       sum=sum/10;
     }
     System.out.print(count);
   }
}
