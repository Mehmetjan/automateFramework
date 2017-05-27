package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;


/**
 * Created by mehmet on 5/25/2017.
 */
public class Menus extends CommonAPI{

    @FindBy(how =  How.CSS, using = "#a[href='/en/who-we-are']")
    public WebElement Menus;

    public WebElement getMenus() {
        return Menus;
    }
    public void firstMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMenus();
    }

    @FindBy(how =  How.CSS, using = "#a[href='/en/what-we-do']")
    public WebElement Menu2;

    public WebElement getMenus2() {
        return Menu2;
    }
    public void secondMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getMenus2();
    }

}
