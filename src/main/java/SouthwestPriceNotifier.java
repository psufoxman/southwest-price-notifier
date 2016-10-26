import org.openqa.selenium.firefox.FirefoxDriver;


public class SouthwestPriceNotifier {
    
    public static void main (String[] args)
    {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.southwest.com");

        driver.quit();
        driver.close();
        
    }
    
}
