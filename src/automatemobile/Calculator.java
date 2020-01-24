package automatemobile;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Calculator 
{
	WebDriver driver;
	
  @Parameters({"cmd"})
  @Test
  public void opencmd(String cmd) throws Exception
  {
	  try 
	  {
		System.out.println("Enter prompt: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.equalsIgnoreCase("cmd"))
		{
			Thread.sleep(10000);
			Runtime.getRuntime().exec(cmd);
		}
	  } 
	  catch (Exception e) 
	  {
		e.printStackTrace();
	}
	  Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 2507\"");
	  URL u=new URL("http://0.0.0.0:2507/wd/hub");
	  DesiredCapabilities dc=new DesiredCapabilities();
	  
	  Thread.sleep(3000);
	  dc.setCapability(CapabilityType.BROWSER_NAME, "");
	  dc.setCapability("deviceName", "2cb5e05d0903");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("platformVersion", "7.0.0");
	  dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
	  dc.setCapability("appPackage", "com.miui.calculator");
	  Thread.sleep(10000);
	  driver=new AndroidDriver(u,dc);
	  //driver.findElement(By.xpath("//*[@resource-id='miui:id/buttonGroup']/[@resource-id='android:id/button1']")).click();
	  driver.findElement(By.xpath("//*[@index='0']/[@index='1']")).click();
	  //driver.findElement(By.xpath("//*[@index='0']/child::index[2]")).click();
  }
  
  /*@Test
  public void clickagree()
  {
	  
  }*/
  
}
