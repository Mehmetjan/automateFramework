package homepage;

import base.CommonAPI;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

import javax.naming.directory.SearchResult;
import javax.swing.*;

/**
 * Created by mehmet on 5/23/2017.
 */
public class Home extends CommonAPI {
    public WebElement search;
    @FindBy(how = How.CSS, using = "#mega-menu-global-search>a>img")
    public WebElement searchButton;
    private SearchResult searchResult;

    public WebElement getSearch() {
        return searchButton;
    }

    public void searchInStore(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSearch().click();

    }

    @FindBy(how = How.CSS, using = "#qterm_id")
    public static WebElement searchword;

    public void searchFor(String economy) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
                    }.getClass().getEnclosingMethod().getName() + ": " + economy));
        searchword.sendKeys(economy, Keys.ENTER);
        Thread.sleep(3000);
           }

        }




