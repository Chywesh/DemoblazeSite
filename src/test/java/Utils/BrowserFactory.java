package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url) {
        if ("chrome".equalsIgnoreCase(browserChoice)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if ("firefox".equalsIgnoreCase(browserChoice)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }
}
