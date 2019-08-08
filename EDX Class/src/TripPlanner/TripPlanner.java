package TripPlanner;
import java.text.NumberFormat;
import java.util.Scanner;

public class TripPlanner {

	public static void main(String[] args) {
		Trip summerTrip = new Trip();
		getTripInfo(summerTrip);
		
	}
	

	public static void getTripInfo(Trip summerTrip) {
		Scanner input = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		System.out.println("Welcome to Vacation Planner!");
		System.out.println("What is your name?");
		summerTrip.travelerName = input.nextLine();
		System.out.println("Nice to meet you " + summerTrip.travelerName + ", What is your destination?");
		summerTrip.destination = input.nextLine();
		System.out.println("Great, " + summerTrip.destination + " sounds like a great trip.");
		System.out.println("**************");
		System.out.println();
		
		System.out.println("How many days are you going to spend traveling?");
		summerTrip.setTravelDays(input.nextInt());
		System.out.println("How much money in USD do you plan to spend?");
		summerTrip.setUsdBudget(input.nextDouble());
		System.out.println("What is the 3 letter currency symbol for your destination?");
		summerTrip.destCurrency = input.next();
		System.out.println("How many "+summerTrip.destCurrency+" are there in 1 USD?");
		summerTrip.setExchangeRate(input.nextDouble());
		System.out.println("If you are traveling for "+summerTrip.getTravelDays()+"days, that is the same as "+summerTrip.getHours()+" hours or "+summerTrip.getMinutes()+" minutes");
		System.out.println("If you are going to spend "+formatter.format(summerTrip.getUsdBudget())+" USD, you can spend up to "+formatter.format(summerTrip.getDailySpend())+" per day.");
		System.out.println("Your total budget in "+summerTrip.destCurrency+", is "+formatter.format(summerTrip.getExchangeBudget())+" "+summerTrip.destCurrency+", which per day is "+formatter.format(summerTrip.getExchangeDailyBudget())+" "+summerTrip.destCurrency);
		System.out.println("**************");
		System.out.println();
		
		
		System.out.println("What is the time difference, in hours between your home and destination?");
		summerTrip.getTimeDifference(input.nextInt());
		System.out.println("That means when it is midnight at home, its "+summerTrip.getDestTime(0)+" in "+summerTrip.destination);
		System.out.println("and when its noon at home, its "+summerTrip.getDestTime(12)+" in "+summerTrip.destination);
		System.out.println("**************");
		System.out.println();
		
		
		System.out.println("What is the square area of your destination country, in KM?");
		summerTrip.setSquareArea(input.nextInt());
		System.out.println("In miles, that is "+summerTrip.getMiles());
		System.out.println("**************");
		System.out.println();
		
		input.close();
		
	}

}
