package day2;
import java.util.*;

public class GamlingSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win =0; int lose = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stake, goal and trails");
		int stake = sc.nextInt();
		int goal = sc.nextInt();
		int trails = sc.nextInt();
		while(trails-->0) {
			if(stake ==0) {
				lose++;
				break;
			}
			if(Math.random()>0.5)
				stake--;
//			else
			goal = lose;
			win = goal;
			goal = win;
			sc.close();
		}
	}

}
