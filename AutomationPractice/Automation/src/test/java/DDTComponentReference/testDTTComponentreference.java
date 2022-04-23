package DDTComponentReference;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObects.ComponentReferencePagePO;

public class testDTTComponentreference extends TestBase {
//	private static final String JSONArray = null;
	ComponentReferencePagePO objComponentRef;
	
//	In the Before test i am creating the driver object to perform operation.
	@BeforeTest
	public void setup() {
		objComponentRef=new ComponentReferencePagePO(driver);
		
		WebDriverManager.chromedriver().setup();
	}

	@Test(dataProvider = "dp")
	public void ComponentReference(String data1) throws Exception {
			
		String CRdata[]=data1.split(",");
		
		System.out.println(CRdata);
		
//		To navigate to the respective URL
		objComponentRef.launchBaseUrl();
		
		try
		{
			objComponentRef.click_error_btn_close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("NO error alert pop up found");
		}
		
//		To navigate to component Reference tab
		objComponentRef.NavigateToComponentReferencePage();

//		Search for the text in quick search box
		objComponentRef.text_quick_search(CRdata[0]);
		
//		selecting data table from the application
		objComponentRef.click_btn_datatable();
		
//		scroll up the page
		scrollUp();

//		Clicking on the Dropdown for selection
		objComponentRef.click_btn_combobox();
		objComponentRef.click_data_table_with_row_actions();
		Thread.sleep(8000);
		scrollUp();
		objComponentRef.click_btn_combobox();
		objComponentRef.click_option_data_table_inline_edit();

//		Switching to nested IFrame
		Thread.sleep(10000);
		objComponentRef.switchingToIframe();
		objComponentRef.disp_lbl_website();
		
//			Updating the table data 
		objComponentRef.click_icon_edit_label();
		objComponentRef.text_label(CRdata[1]);
		
		objComponentRef.click_icon_edit_website();
		objComponentRef.text_website(CRdata[2]);
		
		objComponentRef.click_icon_edit_phone();
		objComponentRef.text_phone(CRdata[3]);
		
		objComponentRef.click_icon_edit_closeAt();
		objComponentRef.click_select_date();
		objComponentRef.click_selectdate_today();
		
		objComponentRef.click_icon_edit_balance();
		objComponentRef.text_balance(CRdata[4]);
					
		
//		Assertion after updating the values 
		Assert.assertEquals(objComponentRef.dis_label_val(), CRdata[1]);
		Assert.assertEquals(objComponentRef.disp_website_val(), CRdata[2]);
		Assert.assertTrue(!objComponentRef.disp_phone_val().isEmpty());
		Assert.assertTrue(objComponentRef.disp_bal_val(),"Balance value is not displayed in the page");
		Assert.assertTrue(objComponentRef.disp_close_at_val());
}
	
	

}
