package day3;
import java.util.*;

public class Binary {

	static int input; 
	static int a;
	static int binary;
    static ArrayList<Integer> s = new ArrayList<Integer>();
    
    static ArrayList<Integer> getBinary(int input) {
		a = input;	
		while(a>0) {
			binary = a%2;
			a = a/2;
		    s.add(0,binary);
		}
		while(s.size()<8)	
			s.add(0, 0);
		return s;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in decimal format");
		input = sc.nextInt();
		
		s = getBinary(input);
		for(int j =0;j<s.size();j++)
		{
			System.out.print(s.get(j));
		}
		sc.close();
		}

}
