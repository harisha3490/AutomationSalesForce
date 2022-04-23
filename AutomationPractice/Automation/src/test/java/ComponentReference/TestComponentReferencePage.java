package ComponentReference;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utilities.TestBase;
import pageObects.ComponentReferencePagePO;

public class TestComponentReferencePage extends TestBase {
	
		ComponentReferencePagePO objComponentRef;
		
//		In the Before test i am creating the driver object to perform operation.
		@BeforeTest
		public void setup() {
			objComponentRef=new ComponentReferencePagePO(driver);
		}

		@Test
		public void ComponentReference() throws Exception {
				
//			To navigate to the respective URL
			objComponentRef.launchBaseUrl();
			
			try
			{
				objComponentRef.click_error_btn_close();
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("NO error alert pop up found");
			}
			
//			To navigate to component Reference tab
			objComponentRef.NavigateToComponentReferencePage();

//			Search for the text in quick search box
			objComponentRef.text_quick_search(System.getProperty("Componentname"));
			
//			selecting data table from the application
			objComponentRef.click_btn_datatable();
			
//			scroll up the page
			scrollUp();

//			Clicking on the Dropdown for selection
			objComponentRef.click_btn_combobox();
			objComponentRef.click_data_table_with_row_actions();
			Thread.sleep(8000);
			scrollUp();
			objComponentRef.click_btn_combobox();
			objComponentRef.click_option_data_table_inline_edit();
	
//			Switching to nested IFrame
			Thread.sleep(10000);
			objComponentRef.switchingToIframe();
			objComponentRef.disp_lbl_website();
			
// 			Updating the table data 
			objComponentRef.click_icon_edit_label();
			objComponentRef.text_label(System.getProperty("Label"));
			
			objComponentRef.click_icon_edit_website();
			objComponentRef.text_website(System.getProperty("WebSite"));
			
			objComponentRef.click_icon_edit_phone();
			objComponentRef.text_phone(System.getProperty("Phone"));
					
			objComponentRef.click_icon_edit_closeAt();
			objComponentRef.click_select_date();
			objComponentRef.click_selectdate_today();

			objComponentRef.click_icon_edit_balance();
			objComponentRef.text_balance(System.getProperty("Balance"));
						
//			Assertion after updating the values 
			Assert.assertEquals(objComponentRef.dis_label_val(), System.getProperty("Label"));
			Assert.assertEquals(objComponentRef.disp_website_val(), System.getProperty("WebSite"));
			Assert.assertTrue(!objComponentRef.disp_phone_val().isEmpty());
			Assert.assertTrue(objComponentRef.disp_bal_val(),"Balance value is not displayed in the page");
			Assert.assertTrue(objComponentRef.disp_close_at_val());
	}
	
}
