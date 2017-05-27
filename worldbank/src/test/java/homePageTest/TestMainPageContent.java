package homePageTest;

import base.CommonAPI;
import homepage.MainPageContent;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by mehmet on 5/26/2017.
 */
public class TestMainPageContent extends CommonAPI{
    @Test
    public void clickOnMainContentLink() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        MainPageContent link1 = PageFactory.initElements(driver, MainPageContent.class );
        link1.clickonLink();

    }
     @Test
    public void testSignup() throws InterruptedException {
         ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
         MainPageContent link1 = PageFactory.initElements(driver, MainPageContent.class );
         MainPageContent sign = PageFactory.initElements(driver, MainPageContent.class );
         sign.enterEmail();
         Thread.sleep(3000);
     }
    @Test
    public void testOpenReport() throws InterruptedException {
     ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
         MainPageContent reportLink = PageFactory.initElements(driver, MainPageContent.class );
         reportLink.openReport1();
         Thread.sleep(4000);
     }
     @Test
    public void ClickOnFacebookicon() throws InterruptedException {
      ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
       MainPageContent facebookLink = PageFactory.initElements(driver, MainPageContent.class );
       facebookLink.clickOnFacebookicon();
       Thread.sleep(2000);

     }
}
