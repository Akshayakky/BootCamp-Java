package day8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;//
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

	static void getRecordFromLine(String line,ArrayList<Integer> animalArray) {
		try(Scanner rowScanner = new Scanner(line)){
			rowScanner.useDelimiter(",");
			while(rowScanner.hasNext()) {
				animalArray.add(Integer.parseInt(rowScanner.next()));
			}
		}
	}
	
	static int[] bubbleSort(int[] integers) {
		for(int i =0;i<integers.length-1;i++) {
			for(int j = 0;j<integers.length-i-1;j++) {
				if(integers[j]>integers[j+1]) {
					int temp = integers[j];
					integers[j] = integers[j+1];
					integers[j+1] = temp;
				}
			}
		}
		return integers;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub		
		File csvFile = new File("C:/Users/aksha/OneDrive/Documents/BLInt.csv");
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		String line = "";
		ArrayList<Integer> intArray = new ArrayList<>();
		try {
			while((line=br.readLine())!=null) {
				getRecordFromLine(line,intArray);
			}			
		}
		catch(FileNotFoundException x) {
			x.printStackTrace();
		}
		int[] integers = new int[intArray.size()];
		integers = intArray.stream().mapToInt(i->i).toArray();
		integers = bubbleSort(integers);
		for(int i = 0;i<integers.length;i++) {
			System.out.println(integers[i]);
			
		}
		
		
	}

}
