package day3;
import java.util.*;

public class RepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar =  new int[101];
		for(int i =0;i<100;i++) {
			ar[i] = i+1;
		}
		ar[100] = 54;
		Arrays.sort(ar);
		for(int i =0;i<100;i++) {
			if(ar[i] == ar[i+1])
				System.out.println(ar[i]);
		}
	}

}
