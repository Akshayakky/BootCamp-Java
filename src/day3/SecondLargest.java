package day3;

public class SecondLargest {

	static int secondMin(int[] a) {
		int min = Integer.MAX_VALUE;
		int secondMin = min;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				secondMin = min;
				min = a[i];
			}
			else if(a[i]<secondMin && a[i]!=min) {
				secondMin = a[i];
			}
		}
		return secondMin;
	}
	
	static int secondMax(int[] a) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i =0;i<a.length;i++) {
			if(a[i]>max)
			{
				secondMax = max;
				max = a[i];
			}
			else if(a[i]>secondMax && a[i]!=max)
				secondMax = a[i];
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,5,3,7,2,7,3,6,54,5,5,4,4,3,34,34,523,234,521,520,522,524};
		System.out.println("Second Largest Element : " + secondMax(a));
		System.out.println("Second Smallest Element : " + secondMin(a));
	}	

}
