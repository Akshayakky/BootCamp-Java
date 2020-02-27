package day3;
import java.util.*;

public class BinaryReverse extends Binary{

	static int i = 0;
	static int j = 4;
	static int decNumber=0;
	
	static ArrayList<Integer> getReverseBinary(ArrayList<Integer> s)
	{		
		while(i!=4) {
		Collections.swap(s, i, j);
		i++;
		j++;
		}
		return s;

	}
	
	static int getDecimal(ArrayList<Integer> s) {
		decNumber = 0;
		int size = s.size()-1;
		for(int k = 0;k<s.size();k++){
			decNumber += s.get(k) * Math.pow(2,size--);
		}
		return decNumber;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the number in decimal format");
		int decimal = sc.nextInt();
		ArrayList<Integer> s = getBinary(decimal);		
		s = getReverseBinary(s);		
		decNumber = getDecimal(s);
		System.out.println(decNumber);
		sc.close();
	}	

}
