package search;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class MainMenus extends CommonAPI {
    @FindBy (how= How.XPATH, using = "//div[text()='Rent']")
    public static WebElement menuRent;
    @FindBy (how= How.XPATH, using ="//a[contains(text(),'Start a Car Reservation')]")
    public static WebElement startRent;

    public static WebElement getMenuRent() {return menuRent;}
    public void rentMenu() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        menuRent.click();
        Thread.sleep(3000);
        startRent.click();
        Thread.sleep(3000);

    }
}
