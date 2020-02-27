package Test;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] notes = {"Thousand","Five Hundred","Hundred","Ten","One"};
		int[] noteAmt = {1000,500,100,10,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt = sc.nextInt();
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
				noteCount = 0;}		
		}		
		sc.close();
	}

}
