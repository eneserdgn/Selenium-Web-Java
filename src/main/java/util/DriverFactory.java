package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    WebDriver driver;
    public static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    /**
     * @param browser
     * @return
     */
    public WebDriver initDriver(String browser) {
        System.out.println("browser value is: " + browser);
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            threadLocalDriver.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            threadLocalDriver.set(new FirefoxDriver());
        } else if (browser.equals("safari")) {
            WebDriverManager.safaridriver().setup();
            threadLocalDriver.set(new SafariDriver());
        } else if (browser.equals("opera")) {
            WebDriverManager.operadriver().setup();
            threadLocalDriver.set(new OperaDriver());
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            threadLocalDriver.set(new EdgeDriver());
        } else if (browser.equals("ie")) {
            WebDriverManager.iedriver().setup();
            threadLocalDriver.set(new InternetExplorerDriver());
        } else {
            System.out.println("Please pass the correct browser value: " + browser);
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        //getDriver().manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return getDriver();
    }

    /**
     * @return
     */
    public static synchronized WebDriver getDriver() {
        return threadLocalDriver.get();
    }
}
