package day1;
import java.util.*;
//import java.lang.Math;

public class Quadratic {

	static void findRoots(double a, double b, double c) {
		double delta = b*b - 4*a*c;
		if(delta<0) {
			System.out.println("No real solutions exist");
			return;
		}
		
		else if(delta == 0)
		{
			double root  = -b + Math.sqrt(delta)/(2*a);
			System.out.println("Root is : " + root);
			return;
		}
		
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("Root 1 : " + root1);
		System.out.println("Root 2 : " + root2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b and c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		findRoots(a,b,c);
		sc.close();
	}

}
