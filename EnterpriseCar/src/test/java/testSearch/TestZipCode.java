package testSearch;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import search.ZipCode;
import utility.reporting.ApplicationLog;

/**
 * Created by mehmet on 5/27/2017.
 */
public class TestZipCode extends CommonAPI{
   @Test
    public void chooseRegion() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        ZipCode region = PageFactory.initElements(driver, ZipCode.class);
        region.enterzipcode();
    }
}
