import java.util.Scanner;

public class Palindrome {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    String s1,s2= "";
    System.out.print("Enter the string: ");
    s1 = input.nextLine();
    int length = s1.length();
    for(int i=length-1; i>=0; i--) {
      s2 = s2+s1.charAt(i);
    }
    System.out.print("\n");
    if (s1.equals(s2)) {
      System.out.print(s1+" is a palindrome");
    } else {
      System.out.print(s1+" is not a palindrome");
    }
  }
}
