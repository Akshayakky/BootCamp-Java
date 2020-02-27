package day2;
import java.util.*;

public class Trig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Angle");
		double angle = sc.nextDouble();
		double angleR = Math.toRadians(angle);
		System.out.println("sin(" + angle +") = " + Math.sin(angleR));
		System.out.println("cos(" + angle +") = " + Math.cos(angleR));
		System.out.println("tan(" + angle +") = " + Math.tan(angleR));
		sc.close();
		}

}
