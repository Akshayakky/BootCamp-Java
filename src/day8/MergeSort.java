package day8;

public class MergeSort {

	static void mergeSort(int[] ar) {
		int a = ar.length;
		if(a<2)
			return;
		int mid = a/2;
		int[] l = new int[mid];
		int[] r = new int[a-mid];
		for(int i = 0;i<l.length;i++) {
			l[i] = ar[i];
		}
		for(int i = mid;i<ar.length;i++) {
			r[i-mid] = ar[i];
		}
		mergeSort(l);
		mergeSort(r);
		merge(l,r,ar);		
	}
	
	static void merge(int[] left,int[] right,int[] ar) {
		int l = 0;
		int r = 0;
		int k = 0;
		while(l<left.length && r<right.length) {
		if(left[l]<=right[r]) {
			ar[k] = left[l];
			l++;
		}
		else {
			ar[k] = right[r];
			r++;
		}
		k++;
		}	
		while (l < left.length) 
        { 
            ar[k] = left[l]; 
            l++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (r < right.length) 
        { 
            ar[k] = right[r]; 
            r++; 
            k++; 
        } 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,4,8,2,9,2,9,2,97,0,-1};
		mergeSort(a);
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
