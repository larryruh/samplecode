import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.assertEquals;

public class Validate {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/larry/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8888/jobsearch_dev/edit_job.php?mode=new");

        NewApplication newApplication = new NewApplication();
        newApplication.submitForm(driver);

       // ConfirmationPage confirmationPage = new ConfirmationPage();
        //confirmationPage.waitForAlertBanner(driver);

        //assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }
}