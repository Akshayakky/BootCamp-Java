package day8;

public class InsertionSortStrings {

	static void insertionSort(String[] s) {		
		String temp="";
		int j;
		for(int i =1;i<s.length;i++) {
			temp = s[i];			
			j=i;			
			while(j>0 && temp.compareTo(s[j-1])<0) {
				s[j] = s[j-1];
				j--;				
			}
			s[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		String s[] = {"ziraf","dog","akshay","cat","abcd","abd","abce","a"};
		insertionSort(s);
		for(int i =0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
