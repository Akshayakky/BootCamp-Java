package Test;
import java.util.*;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter maximum number greater than 0");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<1) {
			System.out.println("invalid input");
			return;
		}
		int l =0;
		int r=n-1;
		System.out.println("Guess no. between " + l + " and " + (n-1));
		int mid = l + (r-l)/2;
		int ans =1;
		while(l<=r) {
			mid = l + (r-l)/2;		
			System.out.println("Is number between " + l + " and " + mid);
			ans = sc.nextInt();
			if(ans==1) {
				if(mid==l) {
					System.out.println(l);
					break;
				}			
			    r=mid;
			}
			else
				l = mid+1;
		}
		sc.close();
	}

}
