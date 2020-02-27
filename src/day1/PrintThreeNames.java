package day1;
import java.util.Scanner;

public class PrintThreeNames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String names = sc.nextLine();
		String[] nameArray = names.split(" ");
		System.out.print("Hi ");
		for(int i = nameArray.length-1;i>=0;i--)
		{
			if(i==0)
				System.out.print(" and " + nameArray[i]);				
			else
				System.out.print(nameArray[i] + ",");				
		}
		sc.close();
	}
}
