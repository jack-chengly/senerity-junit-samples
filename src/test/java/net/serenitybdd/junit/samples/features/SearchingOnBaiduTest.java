package net.serenitybdd.junit.samples.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit.samples.pages.BaiDuPage;
import net.serenitybdd.junit.samples.steps.SearchingOnBaiduSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SearchingOnBaiduTest {

    @Managed
    WebDriver driver;
    
    BaiDuPage baiDuPage;
    
    @Steps
    SearchingOnBaiduSteps steps;

    @Test
    public void should_title_is_contain_keyvalue() {

    	String keyvalue = "helloworld";
        
    	// GIVEN
        steps.navigate_to_baidu_page();
        
         // WHEN
        steps.input_keyvalue_in_txt_search(keyvalue);
        
        // THEN
        steps.should_title_contain_keyvalue(keyvalue);
    }
}
