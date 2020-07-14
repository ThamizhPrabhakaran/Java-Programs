import java.util.Scanner;

public class RigTri {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter the sides of triangle: ");
    double AB = in.nextDouble();
    double BC = in.nextDouble();
    double AC = in.nextDouble();
    double sum = 0, sum1 = 0, sumf = 0;
    if(AB!=0) {
      if(BC!=0) {
        sum = AB*AB;
        sum1 = sum+(BC*BC);
        sumf = Math.sqrt(sum1);
      }
    }
    if(sumf==AC) {
      System.out.print("YES");
    }else{
      System.out.print("NO");
    }
  }
}
