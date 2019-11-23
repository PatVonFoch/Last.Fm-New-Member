package Cucumber.steps;

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

    @When("^User fills out correctly Username field$")
    public void userFillsOutCorrectlyUsernameField() {
        WebElement Username = driver.findElement(By.name("userName"));
        Username.clear();
        Username.sendKeys("Ninogniew");
        //element.submit();
    }

    @And("^User fills out correctly Email field$")
    public void userFillsOutCorrectlyEmailField() {
        WebElement Mail = driver.findElement(By.name("email"));
        Mail.clear();
        Mail.sendKeys("nino@mail.co");
    }

    @And("^User fills out correctly Password field$")
    public void userFillsOutCorrectlyPasswordField() {
        WebElement Password = driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys("qwer5%");
    }

    @And("^User fills out correctly Confirm Password field$")
    public void userFillsOutCorrectlyConfirmPasswordField() {
        WebElement PassConf = driver.findElement(By.name("passwordConf"));
        PassConf.clear();
        PassConf.sendKeys("qwer5%");
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
            driver.findElement(By.cssSelector("button.btn-primary")).click();
        }


        @And("^User becomes a member$")
        public void userBecomesAMember() {
        }

}


