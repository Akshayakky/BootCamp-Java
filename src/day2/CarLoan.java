package day2;
import java.util.*;

public class CarLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount, Time in Years and Rate of Interest");
		double P = sc.nextDouble();
		double Y = sc.nextDouble();
		double R = sc.nextDouble();
		double n = 12*Y;
		double r = R/(12*100);
		double payment = ((P*r)/(1-Math.pow((1+r),-n)));
		System.out.println(payment);
		sc.close();
	}

}
