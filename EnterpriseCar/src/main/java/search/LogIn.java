package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class LogIn extends CommonAPI {
    @FindBy(how= How.XPATH, using=" //strong[text()='Sign In / Join']")
    public static WebElement clickOnLogIn;
    @FindBy(how = How.XPATH, using = "//input[@type='text'][@name='eplus-email']")
    public static WebElement enterEmail;
    @FindBy(how = How.XPATH, using = "//input[@type='password'][@name='eplus-password']")
    public static WebElement enterPassword;
    @FindBy(how = How.XPATH, using = "//button[text()='Sign In']")
    public static WebElement pressSignIn;

    public static WebElement getClickOnLogIn() {return clickOnLogIn; }
    public void clickLogIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnLogIn.click();
        enterEmail.sendKeys("mb.jacque@yahoo.com");
        enterPassword.sendKeys("mehmet1115");
        pressSignIn.click();
        Thread.sleep(4000);
    }
}
