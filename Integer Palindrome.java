import java.util.Scanner;

public class IntegerPalindrome {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    int r,s=0,m;
    System.out.print("Enter the number: ");
    int n = input.nextInt();
    m=n;
    while(n>0) {
      r=n%10;
      s=(s*10)+r;
      n=n/10;
    }
    if (m==s) {
      System.out.print(m+" is a palindrome");
    } else {
      System.out.print(m+" is not a palindrome");
    }
  }
}  
