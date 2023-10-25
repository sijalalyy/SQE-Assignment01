import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkout {
    public static void TextBox(String id, String value){
        try {

            WebElement userNameTextBox = Main.driver.findElement(By.id(id));
            userNameTextBox.sendKeys(value);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

}
//    public static void Checkout() throws InterruptedException {
//        WebElement CheckoutButton = Main.driver.findElement(By.id("checkout"));
//        CheckoutButton.click();
//    }

 //   public static void FirstName
    //   public static void LastName
    //   public static void PostalCode
    //   public static void Continue
    //   public static void Finish






