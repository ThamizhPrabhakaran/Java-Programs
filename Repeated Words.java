import java.util.Scanner;

public class RepeWor {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the string: ");
    String s1 = in.nextLine();
    int length = s1.length();
    int count = 0;
    char[] a = s1.toCharArray();
    System.out.print("Repeated words are: ");
    for(int i=0; i<length; i++) {
      for(int j=i+1; j<length; j++) {
        if(a[i] == a[j]) {
        System.out.print(a[j]+ " ");
        count=count+1;
        }
      }
    }
    if(count==0) {
      System.out.print("NONE");
    }
  }
}
