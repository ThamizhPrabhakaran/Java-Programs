import java.util.Scanner;

public class False {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Input the first number: ");
  double n1 = in.nextDouble();
  System.out.println("Input the second number: ");
  double n2 = in.nextDouble();
  System.out.println(n1>0 && n1<1 && n2>0 && n2<1);
 }
}
