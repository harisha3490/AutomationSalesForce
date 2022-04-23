package Utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class TestBase {

	public static WebDriver driver;
	Logger log = Logger.getLogger(getClass().getSimpleName());

	public utilities oUtil = new utilities();
	
	@BeforeSuite
	public void launch() throws Exception 
	{		
		
//		Reading the properties file
		oUtil.loadPropertiesFile(System.getProperty("user.dir")+"/src/main/java/properties/Config.properties");
		oUtil.loadPropertiesFile(System.getProperty("user.dir")+"/src/main/resources/Propertyfile/ComponentReferenceTestData.properties");
		
		if(System.getProperty("Browser").equalsIgnoreCase("chrome")){
//			This is for windows machine please enable this code for windows machine.
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");

//			This is for lynux browser
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver");
//			driver=new ChromeDriver();
			
			
//			launching the driver with out any path given to it( we need to add the dependency to achieve this)
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else{
			log.info("Browser Name invalid : "+System.getProperty("Browser"));
			
		}
		driver.manage().window().maximize();
		
	}

	@AfterSuite
	public void close ()
	{
//		driver.quit();
	}
	
	public void launchBaseUrl() throws Exception
	{
		System.out.println("URL :: "+System.getProperty("URL"));
		log.info("URL :: "+System.getProperty("URL"));
		driver.get(System.getProperty("URL"));
		
	}
	
	public void scrollUp() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
	}
	
	
	@DataProvider(name="dp")
	public String[] readjson() throws IOException, ParseException
	{
	
		JSONParser jsonparser= new JSONParser();
		
		String jsonFilepath=System.getProperty("user.dir")+"/src/main/resources/Json/testdata.json";
		
//		FileReader reader= new FileReader("..\\src\\main\\resources\\Json\\testdata.json");
		FileReader reader= new FileReader(jsonFilepath);
		Object obj=jsonparser.parse(reader);
		
		JSONObject crjson=(JSONObject)obj;
		
		
		JSONArray ComponentRefDataArray=(JSONArray)crjson.get("Componentreference");
		
		
		String arr[] = new String[ComponentRefDataArray.size()];
		
		for ( int i=0; i<ComponentRefDataArray.size(); i++)
		{
			JSONObject CrData =(JSONObject)ComponentRefDataArray.get(i);
			
			String Cname=(String) CrData.get("Componentname");
			String Clabel=(String) CrData.get("Label");
			String CWs=(String) CrData.get("WebSite");
			String Cphone=(String) CrData.get("Phone");
			String Cbalance=(String) CrData.get("Balance");
			
			arr[i]=Cname+","+Clabel+","+CWs+","+Cphone+","+Cbalance;
			
			
		}
		return arr;
		
	}

	
}
