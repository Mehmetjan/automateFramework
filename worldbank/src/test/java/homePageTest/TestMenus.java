package homePageTest;

import base.CommonAPI;
import homepage.Menus;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

import javax.swing.*;

/**
 * Created by mehmet on 5/25/2017.
 */
public class TestMenus extends CommonAPI {
    @Test
    public void testmenu1() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Menus menu1 = PageFactory.initElements(driver, Menus.class);
        menu1.firstMenu();
        Actions menue1 = new Actions(driver);
        menue1.moveToElement(driver.findElement(By.cssSelector("a[href='/en/who-we-are']"))).perform();
        menu1.clickByCss("a[href='http://www.worldbank.org/en/about/what-we-do']");
        Thread.sleep(3000);
    }
     @Test
    public void testmenu2() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Menus menu2 = PageFactory.initElements(driver, Menus.class);
        menu2.firstMenu();
        Actions menue2 = new Actions(driver);
        menue2.moveToElement(driver.findElement(By.cssSelector("a[href='/en/who-we-are']"))).perform();
        menu2.clickByCss("a[href='http://www.worldbank.org/en/about/leadership']");
        Thread.sleep(3000);
    }


    @Test
    public void whatWeDo1() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Menus menu3 = PageFactory.initElements(driver, Menus.class);
        menu3.firstMenu();
        Actions menue1 = new Actions(driver);
        menue1.moveToElement(driver.findElement(By.cssSelector("a[href='/en/what-we-do']"))).perform();
        menu3.clickByCss(".col-lg-5.col-md-5.col-sm-5>ul>li");
        Thread.sleep(3000);
    }
    @Test
    public void whatWeDo2() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Menus menu4 = PageFactory.initElements(driver, Menus.class);
        menu4.firstMenu();
        Actions menue4_1 = new Actions(driver);
        menue4_1.moveToElement(driver.findElement(By.cssSelector("a[href='/en/what-we-do']"))).perform();
        menu4.clickByCss("a[href='http://www.worldbank.org/projects/country?lang=en&page=']");
        Thread.sleep(3000);
    }



}