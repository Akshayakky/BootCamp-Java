package day3;
import java.util.*;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		while(n%2==0) {
			System.out.print(2 + " ");
			n=n/2;
		}
		for(int i=3;i<=Math.sqrt(n);i=i+2 )
		{
			while(n%i==0) {
				System.out.print(i + " ");
				n=n/i;
			}
		}
		if(n>2)
			System.out.println(n);
		sc.close();
	}

}
