
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.List;

public class Cart {

    // we will call click function, which we have already declared in Login class for ADDTOCART purpose

    public static void Amount(String expectedResult) {
        List<WebElement> Title = Main.driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement i : Title) {
            String actualResult = i.getText();

            if (actualResult.equals(expectedResult)) {
                System.out.println(
                        "Amount Verification Passed:\n" +
                                "Expected Amount: " + expectedResult + "\n" +
                                "Actual Amount: " + actualResult);
            } else {
                System.out.println(
                        "Amount Verification Failed:\n" +
                                "Expected Amount: " + expectedResult + "\n" +
                                "Actual Amount: " + actualResult);
            }
        }
    }
    public static void Title(String expectedResult){
        List<WebElement> Title = Main.driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement i : Title){
            String actualResult = i.getText();
            if (actualResult.equals(expectedResult)) {
                System.out.println(
                        "Product Verification Passed:\n" +
                                "Expected Title: " + expectedResult + "\n" +
                                "Actual Title: " + actualResult);
            } else {
                System.out.println(
                        "Product Verification Failed:\n" +
                                "Expected Title: " + expectedResult + "\n" +
                                "Actual Title: " + actualResult);
            }
        }
    }
    public static void Cart(String xpath) throws InterruptedException {
        WebElement cart = Main.driver.findElement(By.xpath(xpath));
        cart.click();
    }

}
