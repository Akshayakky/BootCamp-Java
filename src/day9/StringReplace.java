package day9;

import java.util.HashMap;
import java.util.Scanner;

public class StringReplace {

	static String mcDonald(String s,char input,HashMap<Character, String> hash) {
		s=s.replaceAll("%ANIMAL%", hash.get(input).split("-")[0]);
		s=s.replaceAll("%SOUND%", hash.get(input).split("-")[1]);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		char[] inputArray = {'a','b','c','d','e','f','g','h','i','j'};
		String[] animal = {"Chicks-chick","Duck-quack","Turkey-gobble",
				"Cat -meow, meow","Mule-Heehaw","Turkey-gobble","Dog-bow wow",
				"Pig-oink, oink","Turtle-nerp, nerp","Cow-moo moo"};
		HashMap<Character, String> hash = new HashMap<>();
		for(int i = 0;i<inputArray.length;i++) {
			hash.put(inputArray[i], animal[i]);
		}	
		String s = "Old MacDonald had a farm,\r\n" + 
				"E-I-E-I-O.\r\n" + 
				"And on his farm he had some %ANIMAL%,\r\n" + 
				"E-I-E-I-O.\r\n" + 
				"With a %SOUND%, %SOUND% here,\r\n" + 
				"And a %SOUND%, %SOUND% there,\r\n" + 
				"Here a %SOUND%, there a %SOUND%,\r\n" + 
				"Everywhere a %SOUND%, %SOUND%,";
		String options = "a. Chicks - chick b. Duck - quack c. Turkey - gobble d. Cat -meow, meow\r\n" + 
				"e. Mule - Heehaw f. Turkey - gobble g. Dog - bow wow h. Pig - oink, oink\r\n" + 
				"i. Turtle - nerp, nerp j. Cow - moo, moo";
		System.out.println("select a - j from below");
		System.out.println(options);
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
	    if(inputStr.length()>1)
			throw new NullPointerException();
		char input = inputStr.charAt(0);
		s = mcDonald(s, input, hash);
		int temp =9;		
		System.out.println(s);
		}
		catch(Exception NullPointerException) {
			System.out.println("Invalid input");;
		}
	}
}
