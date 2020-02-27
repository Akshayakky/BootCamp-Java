package day4;
import java.util.*;


public class MathFunction {

 static Scanner sc = new Scanner(System.in);

 static double harmonicNumber(double n) {
  double har = 0;  
  Boolean flag = false;
  if (n < 1 || n != (int) n) {
   while (flag == false) {
    System.out.println("Entre positive integer");

    n = sc.nextDouble();
    if (n == (int) n)
     flag = true;
   }
  }

  while (n > 0) {
   har = har + (1 / n);
   n--;
  }
  sc.close();
  return har;

 }

 static double sin(double angle) {
  double angleR = Math.toRadians(angle);
  return Math.sin(angleR);
 }

 static double cos(double angle) {
  double angleR = Math.toRadians(angle);
  return Math.cos(angleR);
 }

 static int[] binary(int input) {
  int a = input;
  int binary;
  int[] ar = new int[1000];
  int i = 0;
  int k = 0;
  while (a > 0) {
   binary = a % 2;
   a = a / 2;
   ar[i] = binary;
   i++;
  }
  int[] ar2 = new int[i];
  for (int j = i - 1; j >= 0; j--) {
   ar2[k] = ar[j];
   k++;
  }
  return ar2;
 }

 static double sqrt(double c) {
  if (c < 0) {
   while (c < 0) {
    System.out.println("Enter positive number");
    c = sc.nextInt();
   }
  }
  double t = c;
  double epsilon = Math.pow(10, -15);
  while (Math.abs(t - c / t) > epsilon)
   t = (c / t + t) / 2;
  sc.close();
  return t;
 }

 static double sqrt(double c, double epsilon) {
  if (c < 0) {
   while (c < 0) {
    System.out.println("Enter positive number");
    c = sc.nextInt();
   }
  }
  double t = c;
  while (Math.abs(t - c / t) > epsilon)
   t = (c / t + t) / 2;
  sc.close();
  return t;
 }

 static boolean isPrime(int n) {
  boolean flag = true;
  if (n == 1)
   return false;
  for (int i = 2; i <= n / 2; i++) {
   if (n % i == 0)
    flag = false;
  }
  return flag;
 }

 public static long factorial(int n) {
  n = n + 1;
  int fact = 1;
  while (--n > 0) {
   fact *= n;
  }
  return fact;
 }

 static double futureValue(double c, double r, double t) {
  double futureValue = c * Math.pow(1 + r, t);
  return futureValue;
 }

 static double presentValue(double c, double r, double t) {
  double presentValue = c / Math.pow(1 + r, t);
  return presentValue;
 }

 static int maxValue(int[] a) {
  int max = Integer.MIN_VALUE;
  for (int i = 0; i < a.length; i++) {
   if (a[i] > max)
    max = a[i];
  }
  return max;
 }

 static int minValue(int[] a) {
  int min = Integer.MAX_VALUE;
  for (int i = 0; i < a.length; i++) {
   if (a[i] < min)
    min = a[i];
  }
  return min;
 }

 static String minValue(String[] a) {
  String min = a[0];
  for (int i = 0; i < a.length; i++) {
   if (a[i].length() < min.length())
    min = a[i];
  }
  return min;
 }

 static String maxValue(String[] a) {
  String max = a[0];
  for (int i = 0; i < a.length; i++) {
   if (a[i].length() > max.length())
    max = a[i];
  }
  return max;
 }

 static boolean checkCollinearUsingSlope(double x1, double y1, double x2,
  double y2, double x3, double y3) {
  double slopeAB = (y2 - y1) / (x2 - x1);
  boolean flag = false;
  double slopeBC = (y3 - y2) / (x3 - x2);
  double slopeAC = (y3 - y1) / (x3 - x1);
  if (slopeAB == slopeBC)
   if (slopeBC == slopeAC)
    flag = true;
  return flag;
 }

 static boolean checkCollinearUsingArea(double x1, double y1, double x2,
  double y2, double x3, double y3) {
  double area = ((x1 - x2) * (y2 - y3) - (x2 - x3) * (y1 - y2))/2;
  if (area == 0)
   return true;
  else
   return false;
 }

// public static void main(String[] args) {
//  // TODO Auto-generated method stub
//  double n = harmonicNumber(7);
//  int[] ar = binary(100);
//  
//  System.out.println(futureValue(1000, 0.12, 5));
//  int a[] = {5,6,3,6,37,6,36,3,6,56,37,7443,7,4};
//  String[] s = {"aks","s","Akshay","ak"};
//  System.out.println(minValue(s));
//  System.out.println(maxValue(s));
//  System.out.println(checkCollinearUsingArea(2, 4, 4, 6, 6, 8));
//  
// }

}