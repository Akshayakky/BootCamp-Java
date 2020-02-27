package Test;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gap = 6;int star = 1;
		for(int i = 0;i<7;i++) {
			if(i==4) {
				star-=2;
				gap+=4;
			}
		for(int j = 0;j<gap;j++) {
			System.out.print(" ");
		}if(i<4)
			gap -= 2;
		else
			gap += 2;
		for(int j = 0;j<star;j++) {
			System.out.print("*   ");
		}if(i<4)
		star++;
		else
			star--;
		System.out.println();
	}
//		gap = 2;star = 3;
//		for(int i = 0;i<3;i++) {
//			for(int j = 0;j<gap;j++) {
//				System.out.print(" ");
//			}
//			gap+=2;
//			for(int j = 0;j<star;j++){
//				System.out.print("*   ");
//			}
//			star--;
//			System.out.println();
//		}
	}

}
