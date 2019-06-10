import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewApplication {

    public void submitForm(WebDriver driver)
    {

        String companyName = new String("TestCo");

    	//Fill out form and submit
    	driver.findElement(By.id("date_applied")).sendKeys("01/01/2001");
        driver.findElement(By.cssSelector("option[value='new']")).click();
        driver.findElement(By.id("new_company")).sendKeys(companyName);
        driver.findElement(By.id("job_title")).sendKeys("Application Development Manager");
        driver.findElement(By.cssSelector("option[value='Manager']")).click();
        driver.findElement(By.id("city")).sendKeys("Omaha");
        driver.findElement(By.cssSelector("option[value='NE']")).click();
        driver.findElement(By.id("referred_by")).sendKeys("Linked In");
        driver.findElement(By.id("contact")).sendKeys("Larry Ruh");
        driver.findElement(By.cssSelector("option[value='Applied']")).click();
        driver.findElement(By.id("notes")).sendKeys("Test Notes");
        driver.findElement(By.id("phone_screen")).sendKeys("01/01/2001");
        driver.findElement(By.id("first_interview")).sendKeys("01/01/2001");
        driver.findElement(By.id("second_interview")).sendKeys("01/01/2001");
    	driver.findElement(By.id("offer")).sendKeys("$200,000");
    	driver.findElement(By.id("submit_form")).click();
    	
    	//Verify that new record exists. 
    	//Navigate to the Search Page
    	driver.get("http://localhost:8888/jobsearch_dev/application_list.php");
    	//Create a select object so I can select by option text rather than value
    	Select companyFilter = new Select(driver.findElement(By.id("company_filter")));
    	companyFilter.selectByVisibleText(companyName);		
    	
    	//WebElement assertCompanyName = new String(driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]").toString()));
    	boolean companyCreated = false;
    	//Iterate through table to see if the fictional company exists
    	WebElement table_element = driver.findElement(By.xpath("//table"));
        ArrayList<WebElement> rows = (ArrayList<WebElement>) table_element.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                //System.out.println(cell.getText());
            	if(cell.getText().equals(companyName)) {
                	companyCreated = true;
                }
            }
        }
        
		try {
			Assert.assertTrue(companyCreated);
		} catch (AssertionError e) {
			System.out.println(e);
			throw(e);
		}
    	
		//Data Cleanup Remove the test record
		String DeleteJobSQL = "delete FROM job where company = '" + companyName + "';";
		String DeleteCompanySQL = "delete FROM company where company_name = '" + companyName + "';";
		try (
				Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE, 
						ResultSet.CONCUR_READ_ONLY);
				) {
			stmt.executeUpdate(DeleteJobSQL);
			stmt.executeUpdate(DeleteCompanySQL);

		} catch (SQLException e) {
			System.err.println(e);
		}
    }
}
