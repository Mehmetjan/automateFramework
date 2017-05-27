package homePageTest;

import base.CommonAPI;
import homepage.MenuSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

import static homepage.MenuSearch.SearchCountry;
import static homepage.MenuSearch.getMenuSearch;

/**
 * Created by mehmet on 5/25/2017.
 */
public class TestMenuSearch extends CommonAPI {
    @Test
    public void SearchCountry() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        MenuSearch country = PageFactory.initElements(driver, MenuSearch.class);
        country.searchByCountry();
      //  Actions menue11 = new Actions(driver);
     //   menue11.moveToElement(driver.findElement(By.cssSelector("a[href='/en/where-we-work']"))).perform();
      // country.keysInput("input[type=text][placeholder='Country Name...']");
      //  SearchCountry.sendKeys("France");
      // Thread.sleep(3000);
    }
}
