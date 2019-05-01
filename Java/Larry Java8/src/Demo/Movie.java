package Demo;

public class Movie {
	private String name;
	private String rating;
	private int year;
	private int runtime;
	
	//Constructor
	public Movie(String name, String rating, int year, int runtime){
		this.name = name;
		this.rating = rating;
		this.year = year;
		this.runtime = runtime;
	}
	public String getRating()
	{
		return rating;
	}
	public void setRating(String newRating)
	{
		rating = newRating;
	}
	public String printMovieInfo()
	{
		return "Movie Name: " + name +
				"\nRating: " + rating +
				"\nYear: " + year +
				"\nRuntime: " + runtime + " minutes"; 
	}

}
