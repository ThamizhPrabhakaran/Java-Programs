import java.util.Scanner;
 
public class Average {  
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("Input the first number: ");
 int n1 = in.nextInt();
 System.out.println("Input the second number: ");
 int n2 = in.nextInt();
 System.out.println("Input the third number: ");
 int n3 = in.nextInt();
 System.out.println("The average of the three numbers is: ");
 System.out.println((n1+n2+n3)/3);
 }
}
