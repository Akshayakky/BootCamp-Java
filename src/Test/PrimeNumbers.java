package Test;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flagy = true;
		int flag = 1;
		int count = 0;
		for(int i = 2;i<20000;i++) {
			flagy = true;
			for(int j = 2;j<=i/2;j++) {
				if(count>1000)
					break;
				if(i%j==0) 	{			
						flagy = false;
						break;
				}
			}			
			if(count>1000)
				break;
			if(flagy == true) {
				flag++;				
				if(count<=1000 && flag%2==0) { 
				System.out.print(i+" ");
				count++;}
				else if(count>1000)
					break;
			}			
		}
		System.out.println();
		System.out.println(count);
	}

}
