package day4;
import day2.DayOfWeek;
import day1.LeapYear;

import java.util.Scanner;

public class Calendar {

 	static String getDay(int d,int m,int y) {
		int day = day2.DayOfWeek.getDayNumber(d,m,y);
		String s = "";
		switch(day) {
		case 0 : s = "Sunday";
		break;
		case 1 : s = "Monday";
		break;
		case 2 : s = "Tuesday";
		break;
		case 3 : s = "Wednesday";
		break;
		case 4 : s = "Thursday";
		break;
		case 5 : s = "Friday";
		break;
		case 6 : s = "Saturday";
		}
		return s;
	}
	
	static void printCalendar(int m, int y) {
		int week = 0;
		int days = 31;
		String[] month = {"January","February","March","April","May","June",
				"July","August","September","October","November","December"};
 		System.out.println();
// 		"java calendar " + m + " " + y + "\n"
 		System.out.print(month[m-1] + " " + y +"\n");
		System.out.println(" S  M  T  W  T  F  S");
		int start = DayOfWeek.getDayNumber(1,m,y);		
		for(int i =0;i<start;i++) {
			if(i==0)
				System.out.print("  ");
			else
				System.out.print("   ");
			week++;
		}
		if(m==2) {
			if(LeapYear.leapYear(y))
				days = 29;
			else
				days = 28;
		}
		else if(m == 4 || m == 6 ||  m == 9 || m == 11)
			days = 30;
		for(int i =0;i<=days;i++) {
			if(i==0) {week++;
			continue;
			}
			if(week%7!=1)
				System.out.print(" ");
			if(i<10)
			    System.out.print(" " + i);
			else
				System.out.print(i);
			if(week%7==0)
				System.out.println();
			week++;
		}
	}
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date,month and year");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		String day = getDay(d,m,y);
		System.out.println(day);		
		printCalendar(m, y);
		sc.close();
	}

}
