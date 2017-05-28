package useAmazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by mehmet on 5/27/2017.
 */
public class OrderPhone extends CommonAPI {
    @FindBy (how = How.XPATH, using = "//input[@type='text'][@name='field-keywords']")
    public static WebElement searchPhone;
    @FindBy (how = How.XPATH, using = "//input[@type='submit'][@value='Go']" )
    public static WebElement clickOnSearch;
    @FindBy (how = How.XPATH, using = "//h2[text()='BlackBerry PRIV Factory Unlocked Smartphone, U.S. Warranty (Black)']")
    public static WebElement clickOnphone;

    @FindBy (how  = How.XPATH, using = "//select[@name='quantity']")
    public static WebElement selectQuentity;
    @FindBy (how = How.XPATH, using = ".//*[@id='quantity']/option[2]")
    public static WebElement quentity2;


    @FindBy (how = How.XPATH, using = "//input[@type='submit'][@name='submit.add-to-cart']")
    public static WebElement addToCart;

    public static WebElement getSearchPhone() {return searchPhone;}

    public void searchAphone() throws InterruptedException {
        searchPhone.sendKeys("blackberry");
        clickOnSearch.click();
        Thread.sleep(4000);
        clickOnphone.click();
        Thread.sleep(3000);
        selectQuentity.click();
        quentity2.click();
        addToCart.click();

    }
}
