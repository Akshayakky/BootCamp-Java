package day8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

	static boolean binarySearch(String[] arr,String animal) {
		int lower = 0;
		int upper = arr.length - 1;		
		while(lower<=upper) {
		int mid = lower + (upper-lower)/2;
		int res = animal.compareTo(arr[mid]);
		if(res == 0) 
			return true;
		if(res>0) 
			lower = mid +1;				
		else
			upper = mid -1;				
		}		
		return false;
	}
	
	static void getRecordFromLine(String line,ArrayList<String> animalArray) {	    
	    try (Scanner rowScanner = new Scanner(line)) {
	        rowScanner.useDelimiter(",");
	        while (rowScanner.hasNext()) {
	        	animalArray.add(rowScanner.next());
	        }
	    }	  
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File csvFile = new File("C:/Users/aksha/OneDrive/Documents/BL.csv");
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		String line = "";
		ArrayList<String> animalArray = new ArrayList<>();		
		try {
			while((line=br.readLine())!= null) {
//				String[] count = line.split(",");
//				System.out.println(count[0]+ count[1] );
				getRecordFromLine(line,animalArray);
			}
		}
		catch(FileNotFoundException x) {
			x.printStackTrace();
		}
		
//		System.out.println(animalArray);
//		String[] animals = {"Czy","Czx","Dog","Lion","Zebra"};
//		Arrays.sort(animals);
		String[] animals = new String[animalArray.size()];
		animals = animalArray.toArray(animals);
//		Arrays.sort(animals);		
//		System.out.println(" : " + animals[1]);
		Arrays.sort(animals);
		if(binarySearch(animals,"kfd"))
			System.out.println("Word Found");
		else
			System.out.println("Word Not Found");
	}

}
