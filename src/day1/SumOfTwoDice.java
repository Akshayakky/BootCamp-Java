package day1;
import java.util.*;

public class SumOfTwoDice {

	static int getRandom(int min,int max){
		Random r = new Random();
		return min + r.nextInt(6);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		int sum = 0;
		int times = 2;
		while(times-->0) {
			int rand = getRandom(1,6);						
			sum+=rand;
		}
		System.out.println(sum);		
				
	}

}
