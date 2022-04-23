package Utilities;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class utilities {
	
	public static String currentPath;
	static Properties props = new Properties();
	static FileInputStream fileIn = null;
	Logger log = Logger.getLogger(getClass().getSimpleName()); 
		 
	public void loadPropertiesFile(String propertiesFileNameWithPath) throws IOException
	{
	
	 log.info("Current dir using System:" + propertiesFileNameWithPath);
		fileIn = new FileInputStream(propertiesFileNameWithPath);
		props.load(fileIn);
		System.getProperties().putAll(props);
		// log.info(util.props);
	
	
	
	}
	public boolean ufWaitForElementDisplayed(WebElement element, int itimetowait) throws Exception {
        boolean bResultFlag = false;
        for (int i=0; i<(itimetowait*2); i++)
        {
               try {
               bResultFlag = element.isDisplayed();

               if (bResultFlag){
                     log.info("Element Displayed");
                     log.info("Loop iteration"+i);
                     log.info("Exit Time "+ i/2);
                     return bResultFlag;
               }
               
               }catch(Exception ea) {
               log.info("page still not loaded");
               }
               Thread.sleep(500);
               
        }
        return bResultFlag; 

  }
	
}
