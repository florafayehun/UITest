package stepdefs;

import PageObject.loginPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Gftshp_loginsteps {

    public loginPageObject login;
   public  static WebDriver driver;

   public Gftshp_loginsteps()
   {
    //   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();
       login = new loginPageObject(driver);
   }
    @Given("^I navigate to Giftshop website$")

    public void iNavigateToGiftshopWebsite() {

       // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");


        //driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //step4: Navigate to URL
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://giftshop.giftrete.com");
        driver.manage().window().maximize();
    }

    @When("^I click the My Account options drop down menu option$")
    public void iClickTheMyAccountOptionsDropDownMenuOption() {

        //driver.findElement(By.xpath("//*[@id="top-links"]/ul/li[4]/a/span[1]")).click();
        // throw new PendingException();
        login.Clickacctdropdown();
    }

    @And("^I select Login menu option$")
    public void iSelectLoginMenuOption() {
       // driver.findElement((By.linkText("Login"))).click();
        login.Clicklogin();
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) throws Throwable {
        //driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(username);
        login.Enterusername();
       // throw new PendingException();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws Throwable {
       // driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(password);
        login.Enterpassword();
       // throw new PendingException();
    }

    @And("^I enter click on Login button$")
    public void iEnterClickOnLoginButton() {
        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        login. Clickloginbtn();
        
    }

    @Then("^I am logged In$")
    public void iAmLoggedIn() {
        //Assert.assertEquals(driver.findElement(By.linkText("Account")).getText(),"Account");
        login.Assertxcesslogin();

    }




    @When("^I enter invalid username \"([^\"]*)\"$")
    public void i_enter_invalid_username(String invalidusername) throws Throwable {
        //driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(invalidusername);
        login.Enterinvalidusername(invalidusername);
        //throw new PendingException();
    }

    @When("^I enter invalid password \"([^\"]*)\"$")
    public void i_enter_invalid_password(String invalidpassword) throws Throwable {
       // driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(invalidpassword);
        login.Enterinvalidpassword(invalidpassword);

       // throw new PendingException();
    }
    @Then("^I am unable to login$")
    public void iAmUnableToLogin()
    {
        if(driver.getPageSource().contains(" Warning: No match for E-Mail Address and/or Password.")){
            System.out.println("*************************Text is Present***************************************");
        }else{
            System.out.println("Text is absent");

        }
        driver.quit();

    }
}
