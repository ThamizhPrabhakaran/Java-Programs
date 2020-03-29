import java.util.Scanner;

public class Main {
 public static void main (String[] args) {
  Scanner input = new Scanner (System.in);
  int a = input.nextInt();
  int b = input.nextInt();
  System.out.println("Common factors are: "+factorCount(a,b));
  }
 
 public static int factorCount(int a,int b) {
  int max=0,count=0;
  if (a>b) {
  max=a;
  }
  else {
  max=b;
  } 
  for (int i=1; i<=max; i++) {
   if (((a%i)==0)&&((b%i)==0)) {
   count =+ 1;
   }
  }
  return (count);
 }
}
