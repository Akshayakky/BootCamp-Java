package day1;
import java.util.Scanner;

public class DoubleOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the three double numbers");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println(a%b+c);
		sc.close();
	}

}
