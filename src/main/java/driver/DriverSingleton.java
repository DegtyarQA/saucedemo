package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class DriverSingleton {

    private  WebDriver driver;

    private static ThreadLocal<DriverSingleton> instance = new ThreadLocal<>();

    private DriverSingleton() {
        driver = WebDriverFactory.getWebDriver();
    }

    public static synchronized DriverSingleton getInstance() {
        if (null == instance.get()) {
            instance.set(new DriverSingleton());
        }
        return instance.get();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public  void closeDriver() {
        try {
            driver.quit();
            driver = null;
        } finally {
            instance.remove();
        }
    }
}
