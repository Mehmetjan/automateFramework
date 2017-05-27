package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class SearchCar extends CommonAPI{
    @FindBy (how = How.CSS, using = "#pickupLocationTextBox")
    public static WebElement enterZipCode;
        @FindBy (how = How.CSS, using = "#location-US-22033-Fairfax>a")
    public static WebElement chooseZipCode;
    @FindBy (how = How.CSS, using = "#pickupCalendarFocusable")
    public static WebElement pickUpDate;

    @FindBy (how = How.CSS, using = " #dropoffCalendarFocusable")
    public static WebElement pickURetunrpDate;

    @FindBy (how = How.XPATH, using = "//span[text()='30']")
    public static WebElement clickOnDate;
    @FindBy (how = How.XPATH, using = "//span[text()='31']")
    public static WebElement clickOnReturnDate;

    @FindBy (how = How.XPATH, using = "//a[text()='CONTINUE']")
    public static WebElement clickOnContinue;

    @FindBy (how = How.XPATH, using = "//div[text()='SELECT']")
    public static WebElement selectCar;

    public static WebElement getPickUpDate() { return pickUpDate;}
    public void chooseDate() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        enterZipCode.sendKeys("22033");
        chooseZipCode.click();
        pickUpDate.click();
        clickOnDate.click();
        pickURetunrpDate.click();
        clickOnReturnDate.click();
        Thread.sleep(4000);
        clickOnContinue.click();
        Thread.sleep(12000);
        selectCar.click();
        Thread.sleep(3000);
    }
}
