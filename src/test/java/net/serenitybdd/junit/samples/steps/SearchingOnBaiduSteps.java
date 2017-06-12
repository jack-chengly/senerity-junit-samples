package net.serenitybdd.junit.samples.steps;

import static org.assertj.core.api.StrictAssertions.assertThat;

import net.serenitybdd.junit.samples.pages.BaiDuPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchingOnBaiduSteps  extends ScenarioSteps {
	
	private static final long serialVersionUID = -1676695027390147448L;
	
	BaiDuPage baiDuPage;
	
	@Step
	public void navigate_to_baidu_page()
	{
		baiDuPage.open();
	}

	@Step
	public void input_keyvalue_in_txt_search(String keyvalue)
	{
		baiDuPage.searchFor(keyvalue);
	}
	
	@Step
	public void should_title_contain_keyvalue(String keyvalue)
	{
		System.out.println(baiDuPage.getTitle());
		System.out.println(baiDuPage.toString());
		//assertThat(baiDuPage.getTitle()).contains(keyvalue);
		
		assertThat(baiDuPage.containsText(keyvalue));
	}
}
