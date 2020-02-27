package day1;
import java.util.Scanner;

public class IntOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three integer numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a+b*c);
		System.out.println(a*b+c);
		System.out.println(c+a/b);
		System.out.println(a%b+c);		
		sc.close();
	}

}
