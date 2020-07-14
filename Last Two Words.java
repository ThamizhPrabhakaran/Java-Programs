import java.util.Scanner;

public class LastTwoWords {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the string: ");
    String str = "";
    str = in.nextLine();
    char[] a = str.toCharArray();
    int length = str.length();
    int count = 0;
    for(int i=0; i<=1; i++) {
      for(int j=length-2; j<length; j++) {
        if(a[i]==a[j]) {
          count+=1;
        }
      }
    }
    if(count==2) {
      System.out.print("True");
    } else {
      System.out.print("False");
    }
  }
}
