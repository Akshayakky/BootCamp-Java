package day2;

import java.util.Scanner;

public class DayOfWeek {

   public static int getDayNumber(int d,int m,int y) {
		int y0 = y-(14-m)/12;
		int x = y0 + y0/4 -y0/100 +y0/400;
		int m0 = m+12*((14-m)/12)-2;
		int d0 = (d+x+31*m0/12)%7;
		return d0;
	}
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date,month and year");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		int day = getDayNumber(d,m,y);
		System.out.println(day);
		sc.close();
	}

}
