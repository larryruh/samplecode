/*
 * This program asks the user for the heights of each student in class. 
 * Then finds the height of the tallest student, and the average height of all 
 * students.
 */
package heights;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class Heights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int studentCount;
        double[] studentHeights; 
        
        
        System.out.println("How many students in class");
        studentCount = in.nextInt();
        studentHeights = new double[studentCount];
        for(int i=0;i<studentCount;i++)
        {
        	System.out.println("Please enter height for student " + (i+1));
        	studentHeights[i] = in.nextDouble();
        	
        }
        System.out.println("Tallest person in class is " + getTallest(studentHeights));
        System.out.println("\nAverage height in class is " + getAverage(studentHeights, studentCount));
        
       
        in.close();
        
    }
    public static double getTallest(double[] studentHeights)
    {
    	double tallest = studentHeights[1];
    	for(int i=0;i<studentHeights.length;i++)
    	{
    		if(studentHeights[i] > tallest)
    		{
    			tallest = studentHeights[i]; 
    		}
    	}
    	return tallest;
    }
    public static double getAverage(double[] studentHeights, int studentCount)
    {
    	double average = 0.0;
    	double total = 0;
    	for(int i=0;i<studentHeights.length;i++)
    	{
    		total += studentHeights[i];
    	}
    	return total/studentCount;
    }
    
}
