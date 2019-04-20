package Demo;
import java.util.Scanner;

public class HousePaint {

	public static void main(String[] args) {
		double houseHeight, houseWidth, houseDepth;
		double doorHeight, doorWidth;
		double windowHeight, windowWidth;
		int doorCount, windowCount;
		double surfaceArea, doorArea, windowArea;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter House Height");
		houseHeight = in.nextDouble();
		System.out.println("Please Enter House Width");
		houseWidth = in.nextDouble();
		System.out.println("Please Enter House Depth");
		houseDepth = in.nextDouble();
		System.out.println("Please Enter Number of Doors");
		doorCount = in.nextInt();
		System.out.println("Please Enter Door Height");
		doorHeight = in.nextDouble();
		System.out.println("Please Enter Door Width");
		doorWidth = in.nextDouble();
		System.out.println("Please Enter Number of Windows");
		windowCount = in.nextInt();
		System.out.println("Please Enter Window Height");
		windowHeight = in.nextDouble();
		System.out.println("Please Enter Window Width");
		windowWidth = in.nextDouble();
		
		doorArea = (doorHeight * doorWidth) * doorCount;
		windowArea = (windowHeight * windowWidth) * windowCount;
		surfaceArea = (((houseHeight*houseWidth)*2) + ((houseHeight*houseDepth)*2) - (doorArea + windowArea));
		
		System.out.println("Surface Area to be painted is " + surfaceArea + " square feet");
		
	}

}
