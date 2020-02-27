package day2;
import java.util.*;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = sc.nextInt();
		for(int i =0;i<=n;i++)
		{
			System.out.println((int)Math.pow(2,i));
		}
		sc.close();
	}

}
