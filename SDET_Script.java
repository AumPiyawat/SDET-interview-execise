import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SDET {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("This is SDET interview exercise..");
        System.setProperty("webdriver.chrome.driver", "C:\\BrowserWebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().getPageLoadTimeout();

        //input username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //input password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //click login Button
        driver.findElement(By.id("login-button")).click();

        //click add product to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        //click add product to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        //click shopping cart
        driver.findElement(By.className("shopping_cart_link")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
