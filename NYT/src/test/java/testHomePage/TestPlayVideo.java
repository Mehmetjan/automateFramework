package testHomePage;

import HomePage.PlayVideo;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class TestPlayVideo extends CommonAPI {
    @Test
    public void testPlayVideo() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        PlayVideo playButton = PageFactory.initElements(driver, PlayVideo.class);
        playButton.playvideo();
        }
    }


