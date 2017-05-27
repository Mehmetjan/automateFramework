package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

import java.util.WeakHashMap;

/**
 * Created by mehmet on 5/25/2017.
 */
public class MenuSearch extends CommonAPI{
    @FindBy(how = How.CSS, using = "a[href='/en/where-we-work'],input[type=text][placeholder='Country Name...'],search-submit-icon")
    public static WebElement SearchCountry;

    public static WebElement getMenuSearch() {
        return SearchCountry;
    }
    public void searchByCountry() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions menue11 = new Actions(driver);
        menue11.moveToElement(driver.findElement(By.cssSelector("a[href='/en/where-we-work']"))).perform();
          //  SearchCountry.sendKeys("France");
         SearchCountry.sendKeys("France");
        SearchCountry.click();
        Thread.sleep(6000);
    }
}
