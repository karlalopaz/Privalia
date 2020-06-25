package Privalia;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static junit.framework.Assert.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class StepDefinition
{

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUpTest()
    {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
        driver = new ChromeDriver(opt);
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().setSize(new Dimension(1366, 780));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDownTest()
    {
        driver.quit();
    }

    @When("I am in Privalia home page")
    public void iAmInPrivaliaHomePage() {
    }


    @Then("All the feature ads are up to date")
    public void allTheFeatureAdsAreUpToDate() {
    }


    @Then("All the current ads are up to date")
    public void allTheCurrentAdsAreUpToDate() {
    }


    @Then("Coming up promotions dont have a due date")
    public void comingUpPromotionsDontHaveADueDate() {
    }

}

