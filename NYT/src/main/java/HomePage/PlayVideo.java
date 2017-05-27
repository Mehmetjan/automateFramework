package HomePage;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class PlayVideo extends CommonAPI{
    @FindBy(how = How.XPATH, using = "//*[@class='vhs-icon-play vhs-cover-play-button']")
    public static WebElement playVideo;

    public static WebElement getPlayVideo() {return playVideo;}

    public void playvideo() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,3000)", "");
        playVideo.click();
        Thread.sleep(6000);
    }
}