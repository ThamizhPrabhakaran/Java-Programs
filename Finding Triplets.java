import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	  Scanner in = new Scanner (System.in);
	  System.out.print("Enter the length of the array: ");
	  int n = in.nextInt();
	  System.out.print("Enter the array elements: ");
	  int[] a = new int[n];
	  for(int i=0; i<n; i++) {
	    a[i] = in.nextInt();
	  }
	  int temp = 0;
	  for(int i=0; i<n; i++) {
	    for(int j=i+1; j<n; j++) {
	      if(a[i]>a[j]) {
	        temp=a[i];
	        a[i]=a[j];
	        a[j]=temp;
	      }
	    }
	  }
		int sum = 7;
		System.out.println("\nTriplets of sum "+sum+" is: ");
		for (int i=0; i<=n-3; i++) {
			int k = sum-a[i];
			int i1 = i+1, i2 = n-1;
			while (i1 < i2) {
				if (a[i1] + a[i2] < k) {
						i1++;
				}
				else if (a[i1] + a[i2] > k) {
						i2--;
				}
				else {
						System.out.println("(" + a[i] + " " + a[i1] + " " + a[i2] + ")");
						i1++;
						i2--;
				}
			}
		}
	}
}
