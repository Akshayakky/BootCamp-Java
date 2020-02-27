package day2;
import java.util.*;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of times");
		int times = sc.nextInt();
		double head = 0;
		double tail = 0;
		for(int i = 0;i<times;i++)
		{
			double rd = Math.random();
			if(rd<0.5) {
//				System.out.println("Tails");
				tail++;
			}
			else {
//				System.out.println("Heads");
				head++;
			}
		}
		System.out.printf("Heads Percentage : %.2f ",(head/times*100));
		System.out.println("%");
		System.out.printf("Tails Percentage : %.2f ",tail/times*100);
		System.out.println("%");
		sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Incorrect Input");
		}
	}

}
