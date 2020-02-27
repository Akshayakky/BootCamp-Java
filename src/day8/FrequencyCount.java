package day8;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "To Be Or Not To Be Be Or Not To Be";
		String[] s = str.split(" ");
		HashMap<String,Integer> hash= new HashMap<>(); 
		Arrays.sort(s);
		int i = 0;
		int count =0;	
		int j = 0;
		while(i<s.length) {
			count= 0;						
			j = i;			
			while(j<s.length && s[i].equals(s[j])) {				
				count++;				
				j++;
			}
			hash.put(s[i],count);
			i=j;
		}
		hash.forEach((k,v)-> System.out.println(k+", "+v));		
	}

}
