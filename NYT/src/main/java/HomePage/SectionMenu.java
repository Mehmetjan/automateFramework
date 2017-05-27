package HomePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class SectionMenu extends CommonAPI{

    @FindBy (how= How.XPATH, using="//*[@class='icon sprite-icon']")
    public static WebElement sectionMenu;
    @FindBy (how= How.XPATH, using="//a[contains(text(),'Home Page')]")
    public static WebElement clickOnHomePae ;

    public static WebElement getSectionMenu() {return sectionMenu;}
    public void sentionmenus() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sectionMenu.click();
        clickOnHomePae.click();
     }
}
