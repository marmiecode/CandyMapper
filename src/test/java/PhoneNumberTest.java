import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PhoneNumberTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://candymapper.com/");
        try {

            WebElement xButton = driver.findElement(By.id("popup-widget111379-close-icon"));
            xButton.click();

            WebElement phoneNumberLink = driver.findElement(By.xpath("//a[@id='2']"));
            phoneNumberLink.click();

            WebElement findMyCandyLink = driver.findElement(By.xpath("//a[@href='tel:+442079460']"));
            findMyCandyLink.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement cancelButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
                    "//button[text()='Anuluj']")));
            cancelButton.click();

            System.out.println("Kliknięto 'Anuluj' w oknie dialogowym");
        } catch (Exception E) {
            E.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }



        // jeszcze nie wiem jak kliknąć to okno dialogowe z przeglądarki, ale się dowiem :)

    }
}
