import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JoinUsTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://candymapper.com/");

        WebElement xButton = driver.findElement(By.id("popup-widget111379-close-icon"));
        xButton.click();

        WebElement joinUsLink = driver.findElement(By.xpath("//a[@href='/join-us']"));
        joinUsLink.click();

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("test@test.pl");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("Test");

        WebElement signInButton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        signInButton.click();


    }

}
