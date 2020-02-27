package day1;
import java.util.*;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter x and y");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();		
		double distance = Math.pow(x*x + y*y,0.5);
		System.out.println("Euclidean Distance " + distance);
		sc.close();
	}

}
