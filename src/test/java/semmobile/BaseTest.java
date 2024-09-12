package semmobile;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	public AndroidDriver driver;

	// public AppiumDriverLocalService service;
	
	@BeforeMethod
	public void ConfigureAppium() throws MalformedURLException, URISyntaxException {
		
		//code to start server
				/*service = new AppiumServiceBuilder().withAppiumJS(new File("//Users//SemaDemir//.nvm//versions//node//v20.16.0//lib//node_modules//appium//build//lib//main.js"))
						.withIPAddress("127.0.0.1").usingPort(4723).build();
				service.start();*/
				
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("SemAndroid");
				options.setApp("//Users//SemaDemir//eclipse-workspace//Appium//src//test//java//resources//ApiDemos-debug.apk");
				
				
				
				
				
				 driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options); 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		// service.stop();
	}

}
