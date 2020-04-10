package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class logout_stepdef {
  public static  WebDriver driver;


    public void login(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");


        driver = new ChromeDriver();
        //driver = new FirefoxDriver();

        //step4: Navigate to URL
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://giftshop.giftrete.com");
        driver.manage().window().maximize();
    }

    @Given("^I am logged on to the Giftshop website$")
    public void i_am_logged_on_to_the_Giftshop_website() throws Throwable {

        login();

        driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.caret")).click();
        driver.findElement((By.linkText("Login"))).click();
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("nicholasobagunle@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("nicholas");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

       // throw new PendingException();
    }

    @When("^I select Logout menu option$")
    public void i_select_Logout_menu_option() throws Throwable {
        driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.caret")).click();
        driver.findElement(By.linkText("Logout")).click();
        //throw new PendingException();
    }
    @Then("^I am logged out of the giftrete website$")
    public void i_am_logged_out_of_the_giftrete_website() throws Throwable {
       if(driver.findElement(By.cssSelector("#content > h1")).isDisplayed()){
           System.out.println("Element is Visible");
       }
       else{
           System.out.println("Element is Absent");
       }
        //throw new PendingException();
    }

}
