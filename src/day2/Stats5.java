package day2;

import java.text.DecimalFormat;

public class Stats5 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub		
		double array[] = new double[5];
		double sum = 0;
		
		DecimalFormat df = new DecimalFormat("#.#");
		for(int i =0;i<array.length;i++)
		{
			array[i] = Double.parseDouble(df.format(Math.random()));			
		}

		for(int i =0;i<array.length;i++) {			
//		System.out.printf("%.1f",array[i]);
		System.out.println(array[i]);
		sum+=array[i];
		}
				
		double min = Math.min(array[0], array[1]);
		 
		for(int i =2;i<array.length;i++) {		
			min = Math.min(min, array[i]);		 	
		}
		
		double max = Math.max(array[0],array[1]);
		for(int i =2;i<array.length;i++) {		
			max = Math.max(max, array[i]);			
		}

		System.out.println("average value" + sum/5);
		System.out.println("Minimum value" + min);
		System.out.println("Maximum value" + max);
	}
}
