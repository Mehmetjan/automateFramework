package homepage;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

import java.util.WeakHashMap;

/**
 * Created by mehmet on 5/26/2017.
 */
    public class MainPageContent extends CommonAPI{
    @FindBy (how = How.CSS,using = "a[href='http://www.worldbank.org/en/news/immersive-story/2017/05/09/a-new-holistic-approach-to-nutrition-drops-childhood-stunting-in-senegal']")
    public static WebElement backgroundpic;

    public static WebElement getBackgroundpic() {  return backgroundpic;}
    public void clickonLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        backgroundpic.click();
            }
    @FindBy (how= How.CSS,using="input[type=text][placeholder='Email address']")
    public static WebElement signup;

    public static WebElement getSignup() {return signup;}
    public void enterEmail() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,550)", "");
        signup.sendKeys("mm.jacque@hotmail.com");
        Thread.sleep(3000);
        }
    @FindBy (how = How.XPATH,using = "//a[text()='World Development Report 2017: Governance and the Law']")
    public static WebElement openReport;
    public static WebElement getOpenReport() { return openReport;}
    public void openReport1(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        JavascriptExecutor report = (JavascriptExecutor)driver;
        report.executeScript("window.scrollBy(0,2400)", "");
        openReport.click();
    }

    @FindBy (how = How.XPATH, using = "html/body/div[1]/div[4]/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/ul/li[1]/a/img")
    public static WebElement facebookicon;

    public static WebElement getFacebookicon() {return facebookicon;}
    public void clickOnFacebookicon(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        JavascriptExecutor facebook = (JavascriptExecutor)driver;
        facebook.executeScript("window.scrollBy(0,500)", "");
        facebookicon.click();

    }
}
