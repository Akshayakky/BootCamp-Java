package day2;
import java.util.*;

public class Sqrt {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int c = sc.nextInt();
		if(c<0) {
			while(c<0) {
			System.out.println("Enter positive number");
			c=sc.nextInt();
			}
		}
		int t = c;
		double epsilon = Math.pow(10,-15);
		while(Math.abs(t-c/t)>epsilon)
		t= (c/t + t)/2;
		System.out.println(t);
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Input mismatch! Insert positive integer");
		}
	}

}
