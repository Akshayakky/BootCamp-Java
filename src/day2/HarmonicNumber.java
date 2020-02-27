package day2;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		double n = sc.nextDouble();
		double har = 0;
		Boolean flag = false;

		if(n<1 || n!= (int) n)
		{
			while(flag == false)
			{
				System.out.println("Entre positive integer");
				n = sc.nextDouble();
				if(n==(int) n)
					flag = true;
			}
		}
		
		while(n>0) {
			har = har + (1/n);
			n--;
		}
		System.out.printf("%.5f",har);
		sc.close();
	}

}
