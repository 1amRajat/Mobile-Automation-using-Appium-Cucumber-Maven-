package stepDefinitions;

import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mobautosteps {
	
	@Given("All the pre-requisites are in place appium & android studio")
	public void all_the_pre_requisites_are_in_place_appium_android_studio() {
	   System.out.println("Scenario 2 - step 1");
	}

	@When("Launch the application in mobile and perform the action")
	public void launch_the_application_in_mobile_and_perform_the_action() throws Exception  {
		AppiumDriver driver;
		FileReader reader=new FileReader("D:\\Java\\mob_c\\TestData\\Datatest.properties");
		Properties props=new Properties();
		props.load(reader);
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,props.getProperty("AUTOMATION_NAME"));
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,props.getProperty("PLATFORM_NAME"));
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,props.getProperty("PLATFORM_VERSION"));
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,props.getProperty("DEVICE_NAME"));
		//dc.setCapability(MobileCapabilityType.APP,"D:\\APK\\Money.apk");	
		dc.setCapability(MobileCapabilityType.APP,props.getProperty("APK_PATH"));
		
		URL url = new URL(props.getProperty("Localhost_URL"));
		
		driver = new AppiumDriver(url,dc);
		
		System.out.println("Done");
		Thread.sleep(5000);
		driver.findElement(By.id("app.kwc.math.totalcalc:id/simple_calc_btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("app.kwc.math.totalcalc:id/num7btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("app.kwc.math.totalcalc:id/plusbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("app.kwc.math.totalcalc:id/num7btn")).click();
		Thread.sleep(5000);
		System.out.println("Before back");
		driver.navigate().back();
		driver.quit();
				
		System.out.println("Scenario 2 - step 2");
	}

	@Then("Validate the calculated result with desired outcomes")
	public void validate_the_calculated_result_with_desired_outcomes() {
		System.out.println("Scenario 2 - step 3");
	}

}
