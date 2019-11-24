package Cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LastFmStepsDefinition {
    WebDriver driver;

    @Given("open last.fm join page and accepted cookies")
    public void openLastFmJoinPage() {
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.last.fm/join");
        //_evidon-accept-button
    }

    @When("^User fills out correctly Username field with \"([^\"]*)\"$")
    public void userFillsOutCorrectlyUsernameFieldWith(String arg0) {
        WebElement Username = driver.findElement(By.name("userName"));
        Username.clear();
        Username.sendKeys(arg0);

    }

    @And("^User fills out correctly Email field with \"([^\"]*)\"$")
    public void userFillsOutCorrectlyEmailFieldWith(String arg1) {
        WebElement Mail = driver.findElement(By.name("email"));
        Mail.clear();
        Mail.sendKeys(arg1);
    }

    @And("^User fills out correctly Password field with \"([^\"]*)\"$")
    public void userFillsOutCorrectlyPasswordFieldWith(String arg2)  {
        WebElement Password = driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys(arg2);
    }

    @And("^User fills out correctly Confirm Password field with \"([^\"]*)\"$")
    public void userFillsOutCorrectlyConfirmPasswordFieldWith(String arg3){
        WebElement PassConf = driver.findElement(By.name("passwordConf"));
        PassConf.clear();
        PassConf.sendKeys(arg3);
    }

    @And("^Accepts terms and tickets i'm not robot$")
    public void acceptsTermsAndTicketsIMNotRobot() {
        java.util.List<WebElement> els = driver.findElements(By.xpath("//*[@id=\"id_terms\"]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        for (WebElement el : els) {
            jse.executeScript("arguments[0].click()", el);

    }
    }
        @Then("^User submits by clicking Create my account$")
        public void userSubmitsByClickingCreateMyAccount() {
            WebElement submitButton = driver.findElement(By.className("form-submit")).findElement(By.tagName("button"));
        }


        @And("^User becomes a member$")
        public void userBecomesAMember() {
        // receives a Verifying email from Last.fm
            }


}




