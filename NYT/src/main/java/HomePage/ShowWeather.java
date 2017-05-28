package HomePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class ShowWeather extends CommonAPI {
    @FindBy (how = How.XPATH,using = ".//*[@id='weather']/button")
    public static WebElement showWeather;

    public static WebElement getShowWeather() {return showWeather;}
    public void weatherForcast(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions weath = new Actions(driver);
        weath.moveToElement(driver.findElement(By.xpath(".//*[@id='weather']/button"))).perform();
    }
}
