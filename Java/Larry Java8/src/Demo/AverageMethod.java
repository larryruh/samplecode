package Demo;
import java.util.Scanner;
public class AverageMethod {

	public static void main(String[] args) {
		double num1, num2, num3;
		Scanner in = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		num1 = in.nextDouble();
		num2 = in.nextDouble();
		num3 = in.nextDouble();
		System.out.println("average is "+average(num1, num2, num3));
		

	}
	
	public static double average(double num1, double num2, double num3) {
		return (num1+num2+num3)/3.0;
		
	}

}
