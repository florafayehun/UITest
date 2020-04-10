package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPageObject {

    public loginPageObject(WebDriver driver)
    {

        PageFactory.initElements(driver, this);
    }
    //myacctdropdown menu click action
     @FindBy(how = How.XPATH, using ="//*[@id=\"top-links\"]/ul/li[4]/a/span[1]")
    private WebElement acctdropdown;

    public void Clickacctdropdown()
    {
        acctdropdown.click();
    }

    //longin button click
    @FindBy(how = How.LINK_TEXT, using = "Login" )
    private  WebElement login;

    public void Clicklogin()
    {
        login.click();
    }

    //username click
    @FindBy(how = How.XPATH, using ="//*[@id=\"input-email\"]")
    private WebElement username;

    public void Enterusername()
    {
        username.sendKeys("nicholasobagunle@gmail.com");
    }

//password click

    @FindBy(how = How.XPATH, using ="//*[@id=\"input-password\"]")
    private WebElement password;

    public  void  Enterpassword()
    {
     password.sendKeys("nicholas");
    }

    //click loginbtn
    @FindBy(how = How.XPATH, using ="//*[@id=\"content\"]/div/div[2]/div/form/input")
    private WebElement loginbtn;

    public void Clickloginbtn()
    {
        loginbtn.click();
    }

    //assert successful login
    @FindBy(how = How.LINK_TEXT, using ="Account")
    private WebElement  xcesslogin;

    public  void  Assertxcesslogin()
    {
      String actual_message =  xcesslogin.getText();
      Assert.assertEquals(actual_message, "Account");
      System.out.println("Message passed Succefully");
    }
//enter username
    @FindBy(how = How.XPATH, using ="//*[@id=\"input-email\"]")
    private WebElement invalidusername;

    public void Enterinvalidusername(String invalidusername)
    {

        username.sendKeys(invalidusername);

    }

    //enter invalid password
    @FindBy(how = How.XPATH, using ="//*[@id=\"input-email\"]")
    private WebElement invalidpassword;

    public void Enterinvalidpassword(String invalidpassword)
    {

        password.sendKeys(invalidpassword);

    }

    //assert  test present


}

