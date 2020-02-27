package day4;

import java.util.Arrays;

public class StringFunctions {

	static int NO_OF_CHARS = 256;
	static int[] Hash = new int[NO_OF_CHARS];
	
	static boolean areAnagrams(String string1,String string2) {
		Arrays.fill(Hash, 0);
		if(string1.length()!=string2.length())			
			return false;		
		
		char[] str1 =string1.toCharArray();
		char[] str2 =string2.toCharArray();
		
		for(int i =0;i<str1.length && i<str2.length;i++) {
			Hash[str1[i]]++;
			Hash[str2[i]]--;
		}
		
		for(int i =0;i<Hash.length;i++) {
			if(Hash[i]==1)				
				return false;				
		}
		return true;
	}
	
	static boolean isPalindrome(String s) {
		char[] str = s.toCharArray();		
		int i = 0;
		int j = str.length-1; 
		while(i<j) {
			if(str[j] != str[i])
				return false;
			j--;
			i++;
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String string1 = "heart";
		String string2 = "earth";
		System.out.println(string1.substring(3));
		if(areAnagrams(string1, string2))
			System.out.println("Are anagrams");
		else 
			System.out.println("Are not anagrams");
		System.out.println(isPalindrome("nitin"));
	}

}
