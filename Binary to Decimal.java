import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the binary number: ");
    int num = in.nextInt();
    int temp = num; 
    int sum=0;
    int n=0;
    while(temp>0) {
      sum+=(temp%10)*Math.pow(2,n);
      temp=temp/10;
      n++;
    }
    System.out.print("Converting of binary "+num+" to decimal is "+sum);
  }
}
