package day1;
import java.util.Scanner;

public class SpringSeason {
	static void findSpring(int m,int d) {
		
		if(m<1 || d<1 || m>12 || d>31) {
			System.out.println("Incorrect Date");
			return;
		}
		
		if(((m == 4 || m == 6 ||  m == 9 || m == 11) && (d>30))  ||  (m==2 && d>29))
		{
			System.out.println("Incorrect Date");
			return;
		}

		if((m==3 && d>=20) || (m==4) || (m==5) || (m==6 && d<=20))
			System.out.println("true");
		else
			System.out.println("false");		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		int d = sc.nextInt();
		System.out.println("Enter month");
		int m = sc.nextInt();
		findSpring(m, d);
		sc.close();
	}

}
