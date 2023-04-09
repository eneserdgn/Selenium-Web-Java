package utils;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.config.Config;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {
    private WebDriver driver;

    // Cucumber Hooks
    @BeforeAll
    public static void beforeAll() {
    }

    @AfterAll
    public static void afterAll() {
    }

    @Before()
    public void beforeScenario() {
        String browser = ConfigReader.getProperty("browser");
        String url = ConfigReader.getProperty("url");
        String implicityWait = ConfigReader.getProperty("implicityWait");
        driver = DriverManager.createDriver(browser, url, Integer.parseInt(implicityWait));
    }

    @After()
    public void afterScenario(Scenario scenario) {
        // Cucumber after hook code
        DriverManager.quitDriver();
        if (scenario.isFailed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Screenshot()).build());
        }
    }

    @BeforeStep
    public void beforeStep() {
        // Cucumber before step hook code
    }

    @AfterStep
    public void afterStep(Scenario scenario) throws IOException {

    }

    public String getBase64Screenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }

}
