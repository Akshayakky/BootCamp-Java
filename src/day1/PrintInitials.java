package day1;
import java.util.*;

public class PrintInitials {
	
	static void printK() {
		//K Pattern
		int n = 8;int m =2;
		for(int i = 0 ;i<9;i++)
		{
			System.out.print("**");
			if(i>4)
			{
				for(int j = 0;j<m;j++)
				{
					System.out.print(" ");
				}
				m=m+2;
			}
			else {
			for(int j = 0;j<n;j++)
			{
				System.out.print(" ");
			}
			n=n-2;
			}
			System.out.println("***");
						
		}
		
		System.out.println();
		System.out.println();
	}

	
	static void printD() {
		// D Pattern
		int l = 8;int d = 8;
		for(int i =0;i<9;i++)
		{
			System.out.print("**");
//			System.out.print(i);
			if(i==0 || i==8) {
				for(int j = 0;j<6;j++)
				System.out.print("*");				
			}
			
			else if(i==4 || i==3 || i==5)
			{
				for(int j=0;j<10;j++)
				System.out.print(" ");
			}
			
			else if(i==1 || i==2)
			{
				for(int j=0;j<l;j++)
				System.out.print(" ");
				l++;
			}
			
			else if(i==6 || i==7)
			{
				for(int j=0;j<=d;j++)
				System.out.print(" ");
				d--;
			}

			System.out.print("**");
			System.out.println();
		}
	}
	
	static void printW() {
		//print W
				int a =0;int b=13;int c=-3;int e=13;
				for(int i =0;i<9;i++)
				{
					for(int j=0;j<a;j++) 
						System.out.print(" ");
					a++;
					if(i==8)
					System.out.print("*");
					else
					System.out.print("**");
					for(int j =0;j<b;j++)
						System.out.print(" ");
					b=b-2;
					if(i==8);
					else if(i==7 || i==0)System.out.print("*");
					else System.out.print("**");
					
					
					for(int j =0;j<c;j++)
					System.out.print(" ");
					c=c+2;
					if(i==0);
					else if(i==1 || i==8)
						System.out.print("*");
					else
					System.out.print("**");
					
					
					for(int j =0;j<e;j++)
						System.out.print(" ");
					e=e-2;
					if(i==8);
					else if(i==7)System.out.print("*");
					else System.out.print("**");
					
					System.out.println();
				}
				System.out.println();
				System.out.println();
	}
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter K,W or D");
		char input = sc.next().charAt(0);
		if(input == 'k' || input=='K')
			printK();
		else if(input == 'W' || input =='w')
			printW();
		else if(input == 'd' || input == 'D')
			printD();
		else
			System.out.println("Invalid input");
		sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}