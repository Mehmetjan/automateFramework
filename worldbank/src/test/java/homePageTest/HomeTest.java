package homePageTest;

import base.CommonAPI;
import homepage.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by mehmet on 5/23/2017.
 */
public class HomeTest extends CommonAPI {
      @Test
    public void searchbutton(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Home search = PageFactory.initElements(driver, Home.class);
        search.searchInStore();
    }

     @Test
    public void searchword(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Home search = PageFactory.initElements(driver, Home.class);
        search.searchInStore();
    }
       @Test
    public void whoweare() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Actions menue1 = new Actions(driver);
        menue1.moveToElement(driver.findElement(By.cssSelector("a[href='/en/who-we-are']"))).perform();
        driver.findElement(By.cssSelector("a[href='http://www.worldbank.org/en/about/what-we-do']"));
        Thread.sleep(2000);
    }
}