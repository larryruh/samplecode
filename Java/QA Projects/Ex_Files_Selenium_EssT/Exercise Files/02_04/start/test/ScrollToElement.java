import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement fullName = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fullName);  //Scroll down to the text box
        fullName.sendKeys("Larry Ruh");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("08/04/2018");

        Thread.sleep(1000);

        driver.quit();
    }
}
