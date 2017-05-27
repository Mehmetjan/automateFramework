package testSearch;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.MainMenus;
import utility.reporting.ApplicationLog;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class TestMainMenus extends CommonAPI {
    @Test
    public void testRentMenu() throws InterruptedException {
       ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
       MainMenus menu1 = PageFactory.initElements(driver, MainMenus.class);
      menu1.rentMenu();
   }
}
