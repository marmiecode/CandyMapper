import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneNumberTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://candymapper.com/");

        WebElement xButton = driver.findElement(By.id("popup-widget111379-close-icon"));
        xButton.click();

        WebElement halloweenPartyLink = driver.findElement(By.xpath("//a[contains(text(), 'Halloween Party')]"));
        halloweenPartyLink.click();

        WebElement hostingLink = driver.findElement(By.xpath("//a[contains(text(), 'I Am Hosting A Party')]"));
        hostingLink.click();

        WebElement zombiesButton = driver.findElement(By.xpath("//a[contains(text(), 'Zombies')]"));
        zombiesButton.click();


    }
}
