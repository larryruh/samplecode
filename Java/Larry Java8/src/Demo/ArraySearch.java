package Demo;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> gList = new ArrayList<String>();
		String gSearch;
		Boolean gFound = false;
		for(int i=0;i<5;i++)
		{
			System.out.println("Please enter a grocery items");		
			gList.add(in.next());
		}
		System.out.println("Please enter a grocery item to search for");
		gSearch = in.next();
		for(int i=0;i<gList.size();i++)
		{
			if(gSearch.equalsIgnoreCase(gList.get(i)))
					gFound = true;
		}
		if(gFound)
			System.out.println("Your food was found");
		else
		{
			gList.add(gSearch);
			System.out.println("Your food was not Found but added to list");
		}
		for(int i=0;i<gList.size();i++)
			System.out.println(gList.get(i));
	}

}
