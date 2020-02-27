package day1;
import java.util.Scanner;

public class LeapYear {

	public static boolean leapYear(int year) {
		if((year%400==0)  || (year%4==0 && year%100!=0))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the leap year");
		int year = sc.nextInt();
		if(year<1582)
			System.out.println("LeapYear program only works for year >= 1582");
		else if(leapYear(year))
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is not a leap year");
		sc.close();
	}

}
