package realestatelistings;

public class Property {
	private double askingPrice;
	private String propertyType;
	private double lotSize;
	private int numBaths;
	private int numBeds;
	//Constuctor for Land Only
	public Property(double askingPrice, String propertyType, double lotSize)
	{
		this.askingPrice = askingPrice;
		this.propertyType = propertyType;
		this.lotSize = lotSize;
		numBaths = 0;
		numBeds = 0;
	}
	//Constuctor for lot with house
	public Property(double askingPrice, String propertyType, double lotSize, int numBaths, int numBeds)
	{
		this.askingPrice = askingPrice;
		this.propertyType = propertyType;
		this.lotSize = lotSize;
		this.numBaths = numBaths;
		this.numBeds = numBeds;
	}
	public String toString()
	{
		return "Asking price: $" + askingPrice +
			    "\nProperty Type: " + propertyType +
			    "\nLot Size: " + lotSize +
			    "\nNumber of baths: " + numBaths +
			    "\nNumber of Bedrooms: " + numBeds;
	}
	public void setAskingPrice(double newPrice)
	{
		askingPrice = newPrice;
	}
}
