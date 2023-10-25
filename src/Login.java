import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
    public static void Launch (String path){
        try {
            System.setProperty(Main.property, path);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(Main.argument);
            WebDriver driver = new ChromeDriver(chromeOptions);
            Main.driver = driver;
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void URL(String link){
        try {
            Main.driver.get(link);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void TextBox(String id, String value){
        try {

            WebElement userNameTextBox = Main.driver.findElement(By.id(id));
            userNameTextBox.sendKeys(value);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void Click(String id) throws InterruptedException {
        try {
            WebElement Button = Main.driver.findElement(By.id(id));
            Button.click();
        } catch (Exception e) {
            System.out.println(e);
            Thread.sleep(3000);
        }
    }

}
