package Test;
import java.util.Scanner;

public class Atm2 {
	
	static void getNotes(double amt) {	
		String[] notes = {"Thousand","Five Hundred","Hundred","Ten","One"};
		int[] noteAmt = {1000,500,100,10,1};
		int i = 0;			
		int noteCount = 0;				
		while(amt>0)
		{
			if(amt<noteAmt[i]) {
				i++;
				continue;
			}
			amt = amt-noteAmt[i];
			noteCount++;
			if(amt<noteAmt[i]) {
				System.out.println(notes[i] + " : " + noteCount  + "\n");			
				i++;
				noteCount = 0;
			}	
//			noteCount = (int) amt/noteAmt[i];
//			amt = amt%noteAmt[i];
//
//			if(noteCount!=0)
//			System.out.println(notes[i] + " : "+ noteCount);
//			i++;
//			noteCount=0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt = sc.nextInt();
		getNotes(amt);
		sc.close();
	}

}
