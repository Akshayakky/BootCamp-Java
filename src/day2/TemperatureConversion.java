package day2;
import java.util.*;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for celcius or 2 for fahrenheit");
		int choice = sc.nextInt();
		if(choice == 1)
		System.out.println("Entre temperature in Celcius");
		else
		System.out.println("Entre temperature in Fahrenheit");
		double temp = sc.nextDouble();
		if(choice == 1)
			System.out.println("Tempperature in degree Fahrenheit : " + ((temp*9/5)+32));
		else
			System.out.println("Temperature in degree Celcius : "+((temp-32) *5/9));
		sc.close();
	}

}
