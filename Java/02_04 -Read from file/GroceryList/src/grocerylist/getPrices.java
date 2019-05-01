package grocerylist;
import java.util.Scanner;

public class getPrices {
	String[] fruitList = {"Banana","Apple", "Pear", "Lemon", "Watermelon"};
	double[] prices = new double[5];
    int i;
    double totalPrice = 0;
    Scanner in = new Scanner(System.in);
    
    void getFruitPrices(){

	    for(i=0; i<fruitList.length; i++) {
	    	System.out.println("Please enter " + fruitList[i] + " price");
	    	prices[i] = in.nextDouble();
	    }
    }
    void printPrices() {
	    for(i=0; i<prices.length; i++) {
	     	System.out.printf(fruitList[i] + " = $%5.2f", prices[i]);
	     	System.out.printf("\n");
	     	totalPrice += prices[i];
	     } 
	     System.out.printf("Total Price = $%5.2f", totalPrice);
    }
}
