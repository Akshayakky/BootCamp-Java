package Test;
import java.util.Scanner;

public class GamlingSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stake,goal and trials");
		int stake = sc.nextInt();
		int goal = sc.nextInt();
		int trials = sc.nextInt();
		int balance = stake;
		double wins = 0;
		double bets = 0;
		while(trials-->=0) {
			stake = balance;
		while(stake>0 && stake!=goal) {
			bets++;
			if(Math.random()<0.5) {
				wins++;
				stake+=1;
			}
			else
				stake-=1;
		}
	  }		
		System.out.println("Number of times win : " + wins);
		System.out.printf("Percent win : %.2f\n",wins/bets*100);		
		System.out.println("Bets made : " + bets);
   }
}
