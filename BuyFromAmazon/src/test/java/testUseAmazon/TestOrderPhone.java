package testUseAmazon;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import useAmazon.OrderPhone;
import utility.reporting.ApplicationLog;

/**
 * Created by mehmet on 5/28/2017.
 */
    public class TestOrderPhone extends CommonAPI {
        @Test
        public void searchYourPhone() throws InterruptedException {
            ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
            OrderPhone order = PageFactory.initElements(driver, OrderPhone.class);
            order.searchAphone();
        }
    }

