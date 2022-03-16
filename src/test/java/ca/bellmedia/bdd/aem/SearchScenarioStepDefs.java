package ca.bellmedia.bdd.aem;

// project
import ca.bellmedia.bdd.World;
// cucumber
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
// selenium
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// spring
import org.springframework.beans.factory.annotation.Autowired;
// native
import java.time.Duration;

class SearchScenarioStepDefs {

    private WebDriver driver;

    @Autowired
    public SearchScenarioStepDefs(World world){
        WebDriver driver = world.driver;
        this.driver = driver;
    }


    @Given("user navigates to login page")
    public void user_navigates_to_login_page(){
        driver.get("http://localhost:4502");
    }

    @When("user login as admin")
    public void user_login_as_admin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).toSeconds());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.id("submit-button")).click();
    }

    @Then("user sees admin landing page")
    public void user_sees_admin_landing_page(){
        String titleText = driver.findElement(By.className("granite-title")).getText();
        Assert.assertEquals("Navigation", titleText);
        driver.close();
    }

}
