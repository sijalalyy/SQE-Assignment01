import org.openqa.selenium.WebDriver;

public class Main {

    public static String path = "src\\driver\\chromedriver.exe";
    public static String property = "webdriver.chrome.driver";
    public static String argument = "--remote-allow-origins=*";
    public static WebDriver driver;
    public static String link = "https://www.saucedemo.com/";
//    public static String Title = "Swag Labs";
    public static String userId = "user-name";
    public static String userName = "standard_user";
    public static String password = "secret_sauce";
    public static String passwordId = "password";
    public static String firstnameid = "first-name";
    public static String firstname = "Sijal";
    public static String lastnameid = "last-name";
    public static String lastname = "Ali";
    public static String postalcodeid ="postal-code";
    public static String postalcode ="54321";

    public static void main(String[] args) throws InterruptedException{
        System.out.print("Hello, Swag Labs Running");
        Login.Launch(path);
        Login.URL(link);
        Login.TextBox(userId,userName);
        Login.TextBox(passwordId,password);
        Thread.sleep(3000);
        Login.Click("login-button");
        Thread.sleep(3000);
//        ProductListing.listing("Sauce Labs Backpack");
//        ProductListing.listing("Sauce Labs Bike Light");
//        ProductListing.listing("Sauce Labs Bolt T-Shirt");
//        ProductListing.listing("Sauce Labs Fleece Jacket");
//        ProductListing.listing("Sauce Labs Onesie");
//        ProductListing.listing("Test.allTheThings() T-Shirt (Red)");

        Login.Click("add-to-cart-sauce-labs-bolt-t-shirt");
        Thread.sleep(3000);
//        ProductListing.productSelection();
        Cart.Cart("//a[@class='shopping_cart_link']");
        Thread.sleep(3000);
        Cart.Title("Sauce Labs Bolt T-Shirt");
        Cart.Amount("$15.99");
        Login.Click("checkout");
        Thread.sleep(3000);
        Checkout.TextBox(firstnameid,firstname);
        Checkout.TextBox(lastnameid,lastname);
        Login.TextBox(postalcodeid,postalcode);
        Thread.sleep(3000);
        Login.Click("continue");
        Thread.sleep(3000);
        Login.Click("finish");
        Thread.sleep(3000);







    }
}
