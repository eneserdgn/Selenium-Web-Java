package util;

import util.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.*;
import util.ConfigReader;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Method;
import java.util.Properties;


public class ApplicationHooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties properties;

    /**
     *
     */
    @Before(order = 0)
    public void getProperties() {
        configReader = new ConfigReader();
        properties = configReader.initProp();
    }

    /**
     *
     */
    @Before(order = 1)
    public void before() {
        String browserName = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        String url = properties.getProperty("url");
        driverFactory = new DriverFactory();
        driver = driverFactory.initDriver(browserName);
        driver.get(url);
    }

    /**
     * @param context
     */
    @BeforeSuite
    public void beforeSuite(ITestContext context) {
    }

    /**
     * @param context
     */
    @BeforeTest
    public void beforeTest(ITestContext context) {
    }

    /**
     * @param scenario
     */
    @BeforeStep
    public void beforeStep(Scenario scenario) {
    }

    /**
     * @param context
     */

    @BeforeClass
    public void beforeClass(ITestContext context) {
    }

    /**
     * @param method
     */
    @BeforeMethod
    public void beforeMethod(Method method) {
    }

    /**
     * @param context
     */
    @AfterMethod
    public void afterMethod(ITestContext context) {
    }

    /**
     * @param context
     */
    @AfterClass
    public void afterClass(ITestContext context) {
    }

    /**
     * @param scenario
     */
    @AfterStep
    public void afterStep(Scenario scenario) {
    }

    /**
     * @param context
     */
    @AfterTest
    public void afterTest(ITestContext context) {
    }

    /**
     * @param context
     */
    @AfterSuite
    public void afterSuite(ITestContext context) {
    }

    /**
     * @param scenario
     */
    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Error Screenshot");
        }
        driver.quit();
    }
}
