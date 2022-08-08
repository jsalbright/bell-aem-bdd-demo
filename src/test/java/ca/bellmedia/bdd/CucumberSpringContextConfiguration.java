package ca.bellmedia.bdd;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.ContextConfiguration;

//@ContextConfiguration
@CucumberContextConfiguration
@SpringBootTest
public class CucumberSpringContextConfiguration {

//    private static final Logger LOG = LoggerFactory.getLogger(CucumberSpringContextConfiguration.class);
//
//    private WebDriver driver;
//
//    private World world;
//
//    @Autowired
//    public CucumberSpringContextConfiguration(World world) {
//        this.world = world;
//        world.baseUrl = getBaseUrl();
//        world.driver = getDriver(world);
//    }
//
//    @Before
//    public void setUp(Scenario scenario) {
//
//        this.world.scenario = scenario;
//
//        LOG.info("Scenario info: " + scenario.getName());
//        LOG.info("--------------  Context Initialized For Executing Cucumber Tests --------------");
//    }
//
//    private WebDriver getDriver(World world) {
//        String browser = System.getProperty("browser");
//
//        WebDriver driver;
//
//        // Check for cli-overrides to ensure we're auto-picking the proper browser
//        // Chrome
//        if (browser == null || browser.equals("chrome")) {
//            driver = loadChrome();
//        }
//        // Safari
//        else if (browser.equals("safari")) {
//            if (world.driver == null) {
//                WebDriverManager.safaridriver().setup();
//                driver = new SafariDriver();
//            }
//            else {
//                driver = world.driver;
//            }
//        }
//        // Firefox
//        else if (browser.equals("chrome")) {
//            driver = loadChrome();
//        }
////         else if (browser.equals("firefox")) {
////            if (world.driver == null) {
////                WebDriverManager.firefoxdriver().setup();
////                driver = new FirefoxDriver();
////            }
////         }
//        else {
//            throw new RuntimeException("Invalid browser name!");
//        }
//        this.driver = driver;
//        return driver;
//    }
//
//    @After(order = Integer.MAX_VALUE)
//    public void embedScreenshot(Scenario scenario) throws Exception {
//        if (scenario.isFailed()) {
//            try {
//                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//                // String testName = scenario.getName();
//                scenario.attach(screenshot, "image/png", "adding screenchot...");
//                // scenario.write(testName);
//            }
//            catch (WebDriverException wde) {
//                System.err.println(wde.getMessage());
//            }
//            catch (ClassCastException cce) {
//                cce.printStackTrace();
//            }
//        }
//    }
//
//    @After(order = Integer.MIN_VALUE)
//    public void closeBrowser() {
//        world.driver.quit();
//    }
//
//    private WebDriver loadChrome() {
//        ChromeDriver driver;
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        driver = new ChromeDriver(options);
//
//        return driver;
//    }
//
//    private String getBaseUrl() {
//        String baseUrl = System.getProperty("baseUrl");
//
//        if (baseUrl == null) {
//            baseUrl = "http://localhost:4502/";
//        }
//
//        LOG.info("The Base URL is: " + baseUrl);
//        return baseUrl;
//    }

}
