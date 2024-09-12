package semmobile;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class TestWebApp {
	
	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		
		UiAutomator2Options option = new UiAutomator2Options()
				.setDeviceName("SemAndroid")
				.withBrowserName("Chrome");
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),option);
		driver.get("http://google.com");
		
		
		
		
		
		
		
		
		
	}
	

}
