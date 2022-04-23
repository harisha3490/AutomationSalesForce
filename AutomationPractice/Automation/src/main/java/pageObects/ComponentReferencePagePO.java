package pageObects;

//public class ComponentReferencePagePO {
//
//}
//package pageObects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.TestBase;
public class ComponentReferencePagePO extends TestBase{
	
	public ComponentReferencePagePO(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Component Reference']")
	public WebElement tab_component_reference;	

	@FindBy(xpath="//input[@placeholder='Quick Find' and @class='slds-input']")
	public WebElement txt_quick_search;
	
	@FindBy(xpath="//span[contains(text(),'datatable')]")
	public WebElement btn_datatable;
	
	@FindBy(xpath="//button[contains(@id,'combobox-button')]")
	public WebElement btn_combobox;

	@FindBy(xpath="//span[contains(text(),'Data Table with Inline Edit')]")
	public WebElement option_data_table_inline_edit;
	
	@FindBy(xpath = "//span[contains(text(),'Data Table with Row Actions')]")
	public WebElement data_table_with_row_actions;
	
	@FindBy(xpath="//button[contains(text(),'Run')]")
	public WebElement btn_run;
	
	@FindBy(xpath = "//div[contains(@class,'preview-container')]/iframe")
	public WebElement preview_frame;
	
	@FindBy(xpath ="//div[contains(text(),'Preview')]")
	public WebElement lbl_preview; 
	
	@FindBy(xpath = "//span[@title='Website']")
	public WebElement lbl_website; 
	
	@FindBy(xpath = "//div[contains(@class,'playground-container')]/iframe")
	public WebElement parent_iframe;
	
	@FindBy(xpath="//tbody[contains(@style,'counter-reset: row-number')]/tr[3]/th[contains(@data-label,'Label')]/lightning-primitive-cell-factory/span/button")
	public WebElement icon_edit_label;
	
	@FindBy(xpath="//tbody[contains(@style,'counter-reset: row-number')]/tr[3]/td[contains(@data-label,'Website')]/lightning-primitive-cell-factory/span/button")
	public WebElement icon_edit_website;
	
	@FindBy(xpath="//tbody[contains(@style,'counter-reset: row-number')]/tr[3]/td[contains(@data-label,'Phone')]/lightning-primitive-cell-factory/span/button")
	public WebElement icon_edit_phone;
	
	@FindBy(xpath="//tbody[contains(@style,'counter-reset: row-number')]/tr[3]/td[contains(@data-label,'CloseAt')]/lightning-primitive-cell-factory/span/button")
	public WebElement icon_edit_closeAt;
	
	@FindBy(xpath="//tbody[contains(@style,'counter-reset: row-number')]/tr[3]/td[contains(@data-label,'Balance')]/lightning-primitive-cell-factory/span/button")
	public WebElement icon_edit_balance;
	
	@FindBy(xpath = "(//lightning-primitive-cell-factory[@data-label='Label'])[3]/span/div")
	public WebElement label_value;
	
	@FindBy(xpath = "(//lightning-primitive-cell-factory[@data-label='Website'])[3]/span/div")
	public WebElement website_value;
	
	@FindBy(xpath = "(//lightning-primitive-cell-factory[@data-label='Phone'])[3]/span/div")
	public WebElement phone_value;
	
	@FindBy(xpath = "(//lightning-primitive-cell-factory[@data-label='CloseAt'])[3]/span/div")
	public WebElement close_at_value;
	
	@FindBy(xpath = "(//lightning-primitive-cell-factory[@data-label='Balance'])[3]/span/div")
	public WebElement balance_value;
	
	@FindBy(xpath="//input[@name='dt-inline-edit-text']")
	public WebElement txt_label;
	
	@FindBy(xpath="//input[@name='dt-inline-edit-phone']")
	public WebElement txt_phone;
	
	@FindBy(xpath = "//input[@name='dt-inline-edit-datetime']")
	public WebElement date_Picker;
	
	@FindBy(xpath = "//button[@title='Select a date']")
	public WebElement select_date;
	
	@FindBy(xpath = "//button[contains(text(),'Today')]")
	public WebElement selectdate_today;

	@FindBy(xpath = "//div[@role='combobox']//input[contains(@name,'dt-inline-edit-datetime')]")
	public WebElement time_Picker;

	@FindBy(xpath="//input[@name='dt-inline-edit-currency']")
	public WebElement txt_balance;
		
	@FindBy(xpath="//input[@name='dt-inline-edit-url']")
	public WebElement txt_website;
	
	@FindBy(xpath = "//a[@id='dismissError']")
	public WebElement error_btn_close;
	
	
//	Converting the page objects into methods as per the requirement
	
	public void NavigateToComponentReferencePage() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(tab_component_reference, 6);
		if(tab_component_reference.isDisplayed())
		{
		    JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", tab_component_reference);
		}
	}
	
	public void click_run() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(btn_run, 6);
		if(btn_run.isDisplayed())
		{
			btn_run.click();
		}
	}
	
	public void click_error_btn_close() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(error_btn_close, 6);
		if(error_btn_close.isDisplayed())
		{
			error_btn_close.click();
			driver.navigate().refresh();
		}
	}
	
	public void click_btn_datatable() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(btn_datatable, 6);
		if(btn_datatable.isDisplayed())
		{
			btn_datatable.click();
		}
	}
	
	public void click_btn_combobox() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(btn_combobox, 6);
		if(btn_combobox.isDisplayed())
		{
			btn_combobox.click();
		}
	}
	
	public void click_option_data_table_inline_edit() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(option_data_table_inline_edit, 6);
		if(option_data_table_inline_edit.isDisplayed())
		{
			option_data_table_inline_edit.click();
		}
	}
	
	public void click_data_table_with_row_actions() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(data_table_with_row_actions, 6);
		if(data_table_with_row_actions.isDisplayed())
		{
			data_table_with_row_actions.click();
		}
	}
	
	public void click_icon_edit_label() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(icon_edit_website, 16);
		if(icon_edit_label.isDisplayed())
		{
			icon_edit_label.click();
		}
	}
	
	public void click_icon_edit_website() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(icon_edit_website, 6);
		if(icon_edit_website.isDisplayed())
		{
			icon_edit_website.click();
		}
		
	}
	
	public void click_icon_edit_phone() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(icon_edit_phone, 6);
		if(icon_edit_phone.isDisplayed())
		{
			icon_edit_phone.click();
		}
		
	}
	
	public void click_icon_edit_closeAt() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(icon_edit_closeAt, 6);
		if(icon_edit_closeAt.isDisplayed())
		{
			icon_edit_closeAt.click();
		}
		
	}
	
	public void click_icon_edit_balance() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(icon_edit_balance, 6);
		if(icon_edit_balance.isDisplayed())
		{
		 
			icon_edit_balance.click();
		}
		
	}
	
	
	public void click_select_date() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(select_date, 6);
		if(select_date.isDisplayed())
		{
			JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", select_date);
//			select_date.click();
		}
		
	}
	
	public void click_selectdate_today() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(selectdate_today, 6);
		if(selectdate_today.isDisplayed())
		{
			JavascriptExecutor executor = (JavascriptExecutor)driver;
		    executor.executeScript("arguments[0].click();", selectdate_today);
//			selectdate_today.click();
		}
		
	}
	
	
	
	
	public void text_label(String labelName) throws Exception
	{
		oUtil.ufWaitForElementDisplayed(txt_label, 6);
		if(txt_label.isDisplayed())
		{
			txt_label.clear();
			txt_label.sendKeys(labelName);
			txt_label.sendKeys(Keys.TAB);
			
		}
		
	}
	
	public void text_phone(String phonenumber) throws Exception
	{
		oUtil.ufWaitForElementDisplayed(txt_phone, 6);
		if(txt_phone.isDisplayed())
		{
			txt_phone.clear();
			txt_phone.sendKeys(phonenumber);
			txt_phone.sendKeys(Keys.TAB);
		}
		
	}
	
	public void text_balance(String balance) throws Exception
	{
		oUtil.ufWaitForElementDisplayed(txt_balance, 6);
		if(txt_balance.isDisplayed())
		{
			txt_balance.clear();
			txt_balance.sendKeys(balance);
			txt_balance.sendKeys(Keys.TAB);
		}
		
	}
	
	public void text_website(String websiteName) throws Exception
	{
		oUtil.ufWaitForElementDisplayed(txt_website, 6);
		if(txt_website.isDisplayed())
		{	
			
			txt_website.clear();
			txt_website.sendKeys(websiteName);
			txt_website.sendKeys(Keys.TAB);
		}
		
	}
	
	public void text_quick_search(String quicksearchtext) throws Exception
	{
		oUtil.ufWaitForElementDisplayed(txt_quick_search, 6);
		if(txt_quick_search.isDisplayed())
		{
			txt_quick_search.clear();
			txt_quick_search.sendKeys(quicksearchtext);
		}
		
	}
	
	public void text_date_Picker(String date) throws Exception
	{
		oUtil.ufWaitForElementDisplayed(date_Picker, 6);
		if(date_Picker.isDisplayed())
		{
			date_Picker.clear();
			date_Picker.sendKeys(date);
			date_Picker.sendKeys(Keys.TAB);
		}
		
	}
	
	public void text_time_Picker(String time) throws Exception
	{
		oUtil.ufWaitForElementDisplayed(time_Picker, 6);
		if(time_Picker.isDisplayed())
		{
			time_Picker.clear();
			time_Picker.sendKeys(time);
			time_Picker.sendKeys(Keys.TAB);
		}
		
	}
	
	public void iframe_switch(WebElement ele) throws Exception
	{
		oUtil.ufWaitForElementDisplayed(ele, 6);
		if(ele.isDisplayed())
		{
		 
			driver.switchTo().frame(ele);
			
		}
		
	}
		
	public void switchingToIframe() throws Exception{
		iframe_switch(parent_iframe);
		iframe_switch(preview_frame);	
	}
	
	public void switchingToParentiframe()throws Exception{
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
	}
	
	public void disp_lbl_preview() throws Exception{
		
		lbl_preview.isDisplayed();
	}
	
	public void disp_lbl_website() throws Exception{
		
		lbl_website.isDisplayed();
	}
	
	public String dis_label_val() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(label_value, 6);
		return label_value.getText();
		
	}
	
	public String disp_website_val() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(website_value, 6);
		return website_value.getText();
		
	}	
	
	public String disp_phone_val() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(phone_value, 6);
		return phone_value.getText();
		
	}			

	public boolean disp_close_at_val() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(close_at_value, 6);
		return close_at_value.isDisplayed();
		
	}			

	public boolean disp_bal_val() throws Exception
	{
		oUtil.ufWaitForElementDisplayed(balance_value, 6);
		return balance_value.isDisplayed();
		
	}			
}
