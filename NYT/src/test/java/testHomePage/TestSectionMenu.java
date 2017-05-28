package testHomePage;

import HomePage.SectionMenu;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by mehmet on 5/27/2017.
 */
public class TestSectionMenu extends CommonAPI{
    @Test
    public void testSectionMenu() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        SectionMenu menu1 = PageFactory.initElements(driver, SectionMenu.class);
        menu1.sentionmenus();
        Thread.sleep(2000);
    }
}
