package Demo;
import java.util.Scanner;

public class PatientCharges {

	public static void main(String[] args) {
		boolean anotherPatient;
		do {
			
			double charges[] = new double[3];
			double totalCharges = 0;
			getCharges(charges);
			if(charges[0] == 0.0) {
				totalCharges = calcCharges(charges[1],charges[2]);
			} else {
				totalCharges = calcCharges(charges);
			}
			anotherPatient = printCharges(totalCharges);
		} while (anotherPatient == true);
		
	}
	public static void getCharges(double[] charges) {
		String overNightPrompt;
		Scanner in = new Scanner(System.in);
		System.out.println("Is this an Overnight Stay? (Yes/No)");
		overNightPrompt = in.next();
		if(overNightPrompt.equalsIgnoreCase("Yes")) {
			System.out.println("What is the overnight Charge");
			charges[0] = in.nextDouble();
		} else {
			charges[0] = 0.0;
		}
		System.out.println("Please enter lab fee");
		charges[1]= in.nextDouble();
		System.out.println("Please enter medicine fee");
		charges[2] = in.nextDouble();
		
	}
	public static double calcCharges(double lRate, double mRate) {
		return lRate + mRate;
	}
	public static double calcCharges(double[] charges) {
		double runningCharge = 0;
	
		for(int i = 0;i<charges.length;i++) {	
			runningCharge += charges[i];
		}
		return runningCharge;
	}
	public static Boolean printCharges(double total) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Your total is $%5.2f", total);
		System.out.println("\nWould you like to calculate another patient? (Yes/No");
		if(in.next().equals("Yes")) {
			return true;	
		} else {
			return false;
		}
		
		
		
	}

}
