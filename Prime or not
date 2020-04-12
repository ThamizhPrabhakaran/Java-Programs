import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the number: ");
    int n = input.nextInt();
    int x=0,flag=0;
    x=n/2;
    if (n==0||n==1) {
      System.out.print(n+" is not a prime number");
    } else {
      for(int i=2; i<=x; i++) {
        if((n%i)==0) {
          flag=1;
          System.out.print(n+" is not a prime number");
          break;
        }
      }
    } if(flag==0) {
        System.out.print(n+" is a prime number");
      }
  }
}
