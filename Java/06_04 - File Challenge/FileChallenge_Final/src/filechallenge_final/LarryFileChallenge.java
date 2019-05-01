package filechallenge_final;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LarryFileChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		File inputFile = new File("menuNoPrices.txt");
		File outputFile = new File("menuWithPrices.txt");
		ArrayList<String> menuItems= new ArrayList<String>();	
		double price;
		//Read from the file
		Scanner input;
		try {
			input = new Scanner(inputFile);
			while(input.hasNextLine())
				menuItems.add(input.nextLine());
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error = " + e.toString());
		}
		try {
			PrintWriter output = new PrintWriter(outputFile);
			for(int i=0;i<menuItems.size();i++)
			{
				System.out.println("Please enter price for " + menuItems.get(i));
				price = in.nextDouble();
				output.println(menuItems.get(i)+ "\t$" + price);
			}
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Write Error = " + e.toString());
		}
		
		
		//

	}

}
