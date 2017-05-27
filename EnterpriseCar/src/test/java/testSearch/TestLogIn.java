package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.LogIn;
import utility.reporting.ApplicationLog;

/**
 * Created by mehmet on 5/27/2017.
 */
public class TestLogIn extends CommonAPI {
    @Test
    public void testClickLogIn() throws InterruptedException {
    ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        LogIn login = PageFactory.initElements(driver, LogIn.class);
        login.clickLogIn();
    }
}
