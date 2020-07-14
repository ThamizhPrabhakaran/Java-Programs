import java.util.Scanner;

public class DeciConv {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the decimal number: ");
    int a = in.nextInt();
    binConv(a);
  }
  public static void binConv (int a) {
    String binary = "";
    int temp =a;
    int rem = 0;
    while (a != 0) {
      rem = a % 2;
      binary = rem + binary;
      a = a / 2;
    }
    System.out.print("Converting decimal "+temp+ " to binary is "+binary);
  }
}
