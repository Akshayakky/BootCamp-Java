package day9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplaceRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] inputArray = {'a','b','c','d','e','f','g','h','i','j'};
		String[] animal = {"Chicks-chick","Duck-quack","Turkey-gobble",
				"Cat -meow, meow","Mule-Heehaw","Turkey-gobble","Dog-bow wow",
				"Pig-oink, oink","Turtle-nerp, nerp","Cow-moo moo"};
		String s = "Old MacDonald had a farm,\r\n" + 
				"E-I-E-I-O.\r\n" + 
				"And on his farm he had some %ANIMAL%,\r\n" + 
				"E-I-E-I-O.\r\n" + 
				"With a %SOUND%, %SOUND% here,\r\n" + 
				"And a %SOUND%, %SOUND% there,\r\n" + 
				"Here a %SOUND%, there a %SOUND%,\r\n" + 
				"Everywhere a %SOUND%, %SOUND%,";
		Pattern pattern = Pattern.compile("%ANIMAL%");
		Matcher matcher = pattern.matcher(s);
		System.out.println("Enter choice");
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		if(matcher.find()) {
			s = s.replaceAll("%ANIMAL%", "dog");
		}
		System.out.println(s);
	}

}
