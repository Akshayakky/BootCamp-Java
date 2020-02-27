package Test;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {5,2,4,1,3,9,7,6};
		int temp,j;
		for(int i = 1;i<ar.length;i++) {
			temp = ar[i];
			j= i;
			while(j>0 && ar[j-1]>temp) {
				ar[j] = ar[j-1];
				j = j-1;
			}
			ar[j] = temp;
		}
		for(int i =0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
