package semmobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends BaseTest{
	
	
	@Test
	public void  AppiumTest()  throws MalformedURLException, URISyntaxException {
		
		//AndroidDriver , IOSDriver
		//Appium code (Client) => AppiumServer => Mobile 
		//first arg is server path (local ip) second arg is capabilities
		
		//code to start server
		/*AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//Users//SemaDemir//.nvm//versions//node//v20.16.0//lib//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();*/
		
		/*UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("SemAndroid");
		options.setApp("//Users//SemaDemir//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
		
		
		
		
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options); */
		
		//Appium Locators: Xpath,id,accessibilityId,classname,androidUIAutomator 
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		
		driver.quit();
		//service.stop();
		
	}

}
