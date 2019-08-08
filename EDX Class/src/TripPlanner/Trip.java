package TripPlanner;

public class Trip {
	
	String travelerName;
	String destination;
	private static int travelDays;
	private static double usdBudget;
	String destCurrency;
	private static double exchangeRate;
	static int timeDifference;
	static int squareArea;
	
	public int getHours() {
		return getTravelDays()*24;
	}
	
	public int getMinutes() {
		return getTravelDays()*24*60;
	}
	
	public double getDailySpend() {
		return getUsdBudget() / getTravelDays();
	}
	
	public double getExchangeDailyBudget() {
		return getExchangeBudget()/getTravelDays() ;
	}
	
	public double getExchangeBudget() {
		return getUsdBudget() * getExchangeRate() ;
	}
	
	public String getDestTime(int time) {
		int destTime = time + timeDifference;
		return  destTime + ":00";
	}
	
	public double getMiles() {
		return squareArea/1.6;
	}

	public static double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		Trip.exchangeRate = exchangeRate;
	}

	public double getUsdBudget() {
		return usdBudget;
	}

	public void setUsdBudget(double usdBudget) {
		Trip.usdBudget = usdBudget;
	}

	public int getTravelDays() {
		return travelDays;
	}

	public void setTravelDays(int travelDays) {
		Trip.travelDays = travelDays;
	}
	
	public int getTimeDifference() {
		return timeDifference;
	}

	public void getTimeDifference(int timeDifference) {
		Trip.timeDifference = timeDifference;
	}
	
	public int getSquareArea() {
		return squareArea;
	}

	public void setSquareArea(int d) {
		Trip.squareArea = d;
	}
	
}
