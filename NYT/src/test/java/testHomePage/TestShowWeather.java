package testHomePage;

import HomePage.ShowWeather;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by mehmet on 5/27/2017.
 */
public class TestShowWeather extends CommonAPI{
    @Test
    public void showWather(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        ShowWeather weather = PageFactory.initElements(driver, ShowWeather.class);
        weather.weatherForcast();

    }
}
