package net.serenitybdd.junit.samples.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@DefaultUrl("http://www.baidu.com")
public class BaiDuPage extends PageObject {
    @FindBy(name="wd")
    WebElement txt_search;

    @FindBy(id="su")
    WebElement btn_baidu;
    
    public void searchFor(String keywords) {
    	txt_search.sendKeys(keywords, Keys.ENTER);
        //waitFor(titleContains("Google Search"));
    	waitFor(visibilityOf(btn_baidu));
    }
}
