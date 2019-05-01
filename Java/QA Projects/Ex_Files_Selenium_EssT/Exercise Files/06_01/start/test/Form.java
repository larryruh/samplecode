import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Larry");

        driver.findElement(By.id("last-name")).sendKeys("Ruh");

        driver.findElement(By.id("job-title")).sendKeys("King of the Universe");

        driver.findElement(By.id("radio-button-1")).click();

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]")).click();
        //****Either xpath or cssSelector****// driver.findElement(By.cssSelector("option[value='3']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("08/04/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

        String alertText = alert.getText();
        if(alertText == "The form was successfully submitted!"){
            return;
        }

        //assertEquals("The form was successfully submitted!", alertText);
        driver.quit();
    }


}
