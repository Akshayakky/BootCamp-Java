package day3;
import java.util.*;

public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Hash = new int[7];
		int max = Integer.MIN_VALUE,maxIndex= 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times");
		int n = sc.nextInt();
		while(n-->0) {
		int ran = 1 + rand.nextInt(6);
		System.out.println(ran);
		Hash[ran]++;	
		}
		
		for(int i = 0;i<Hash.length;i++) {
			if(Hash[i]>max) {
				max= Hash[i];
				maxIndex = i;
			}
		}
		
		for(int i=0;i<Hash.length;i++) {
			if(Hash[i]==max && max!=1  && i!=maxIndex)
				System.out.print(i + ",");
		}
		if(max==1)
			System.out.println("All numbers occurred once");
		else
			System.out.print(maxIndex + " occurred " + max +" times");
		sc.close();
	}

}
