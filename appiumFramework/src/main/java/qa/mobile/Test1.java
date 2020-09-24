package qa.mobile;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class Test1 {
	AppiumDriver driver;
 @Test
  public void f() {
	 System.out.println("test ");
  }
  
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  
	  DesiredCapabilities caps= new DesiredCapabilities();
	  caps.setCapability("platformName", "Android");
	  caps.setCapability("platformVersion", "9.0");
	  caps.setCapability("deviceName", "5200d8314ef7c4e9");
	  //caps.setCapability("automationName", "UiAutomator2");
	  caps.setCapability("app", "C:\\Users\\Panchal\\Downloads\\com.ebay.mobile.apk");
	  
	  URL url=new URL("http://127.0.0.1:4723/wd/hub");
	  driver= new AndroidDriver(url,caps);
	  
	  String sessionId=driver.getSessionId().toString();
	  	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  System.out.println("test done");
  }

}
