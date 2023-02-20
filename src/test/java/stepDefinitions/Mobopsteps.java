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


import static org.junit.Assert.*;

public class Mobopsteps {
	
	@Given("User launch")
	public void user_launch() {
	    System.out.println("Test1");
	}

	@When("Second step")
	public void second_step() throws Exception {
		AppiumDriver driver;
		FileReader reader=new FileReader("D:\\Java\\mob_c\\TestData\\Datatest.properties");
		Properties props=new Properties();
		props.load(reader);
		String val = props.getProperty("First_val");
		System.out.println(val);
		System.out.println(props.getProperty("select_simple"));
		System.out.println(props.getProperty("btn_seven"));
		System.out.println(props.getProperty("action_plus"));
		/*
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		//dc.setCapability(MobileCapabilityType.APP,"D:\\APK\\Money.apk");	
		dc.setCapability(MobileCapabilityType.APP,"D:\\APK\\Calc.apk");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
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
		*/
		System.out.println("Test2"); 
	}

	@Then("Final validation")
	public void final_validation() {
		System.out.println("Test3");
	}

}
