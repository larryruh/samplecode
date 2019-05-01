/*
 * This program demonstrates the use of an array
 */
package grocerylist;
import java.util.Scanner;

/**
 *
 * @author Larry Ruh
 */
public class GroceryList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	getPrices fruitList = new getPrices();
    	fruitList.getFruitPrices();
    	fruitList.printPrices();
    }
}
