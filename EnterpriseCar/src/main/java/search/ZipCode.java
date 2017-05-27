package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class ZipCode extends CommonAPI {
    @FindBy (how = How.CSS, using = "#pickupLocationTextBox")
    public static WebElement enterZipCode;

    @FindBy (how = How.CSS, using = "#location-US-22033-Fairfax>a")
    public static WebElement chooseZipCode;

    public static WebElement getEnterZipCode() {return enterZipCode;}
    public void enterzipcode() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enterZipCode.sendKeys("22033");
        chooseZipCode.click();
        Thread.sleep(2000);

    }
}
