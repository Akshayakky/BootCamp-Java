package day8;

public class MergeSortString {

	static void mergeSort(String[] s) {
		if(s.length<2)
			return;
		int n = s.length;
		int mid = n/2;
		String[] l = new String[mid];
		String[] r = new String[n-mid];
		for(int i =0;i<l.length;i++) {
			l[i] = s[i];
		}
		for(int i =mid;i<s.length;i++) {
			r[i-mid] = s[i];
		}
		mergeSort(l);
		mergeSort(r);
		merge(l,r,s);
	}
	
	static void merge(String[] l,String[] r,String[] s) {
		int i =0,j=0,k=0;
		while(i<l.length && j<r.length) {
			int res = l[i].compareTo(r[j]);
			if(res<=0) {
				s[k] = l[i];
				i++;
			}
			else {
				s[k] = r[j];
				j++;
			}
			k++;
		}
		while(i<l.length) {
			s[k] = l[i];
			i++;
			k++;
		}
		while(j<r.length) {
			s[k] = r[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"ziraf","dog","akshay","cat","abcd","abd","abce","a"};
		mergeSort(s);
		for(int i =0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
