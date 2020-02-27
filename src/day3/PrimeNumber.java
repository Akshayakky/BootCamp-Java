package day3;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min amd max range");
		int min = sc.nextInt();
		int max = sc.nextInt();
		if(max<min || min<0 || max<0)
			{System.out.println("incorrct range");	
			sc.close();
			return;
			}
		boolean flag; 
		for(int i = min;i<=max;i++)
		{
			flag = true;
			for(int j = 2;j<=i/2;j++)
			{
				if(i%j==0)				
					flag = false;				
			}
			if(flag == true && i!=1)
				System.out.println(i);
		}
		sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
