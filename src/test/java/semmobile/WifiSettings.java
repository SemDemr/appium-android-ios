package semmobile;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumBy;

public class WifiSettings extends BaseTest{
	
	@Test
	public void WifiSettingsName() {
		
		
		//xpath,id, accessibilityId, classname, androidUIAutomator
		//for classname AppiumBy is better
		//tagName[@attribute='value'] -> //tagName these are both xpaths 
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		//assertion before send text
		
		String alertTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
		//SoftAssert soft = new SoftAssert();
		Assert.assertEquals(alertTitle, "WiFi settings");
		
		driver.findElement(By.id("android:id/edit")).sendKeys("SilverWifi");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		//soft.assertAll();
	}
	
	
	
	

}
