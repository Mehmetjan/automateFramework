package useAmazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class LogIn extends CommonAPI{
    @FindBy (how = How.XPATH, using ="//*[@id='nav-link-accountList']")
    public static WebElement mouseToLogIn;

    @FindBy (how = How.XPATH, using = "//*[@id='nav-flyout-ya-signin']/a/span")
    public static WebElement clickOnSignIn;
    @FindBy (how = How.XPATH, using = "//input[@type='email'][@name='email']")
    public static WebElement enterEmail;
    @FindBy (how = How.XPATH, using = "//input[@type='password'][@name='password']")
    public static WebElement enterPassword;
    @FindBy (how = How.XPATH, using = "//input[@type='submit'][@id='signInSubmit']")
    public static WebElement clickSignIn;

    public static WebElement getMouseToLogIn() { return mouseToLogIn; }
    public void clickonLogin() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mouseToLogIn.click();
        clickOnSignIn.click();
        enterEmail.sendKeys("mb.jacque@gmail.com ");
        enterPassword.sendKeys("mehmet1115");
        clickSignIn.click();
        Thread.sleep(3000);
         }

}


