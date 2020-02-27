package day8;

public class passbyValue {

	void call(int[] a) {
		int[] b = {1,2};
		a = b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7};
		passbyValue pv = new passbyValue();		
		pv.call(a);
		System.out.println(a[0]);
	}
}
