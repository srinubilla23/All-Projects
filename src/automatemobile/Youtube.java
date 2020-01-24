package automatemobile;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Youtube 
{
	@Test
	public void launchamd() throws Exception
	{
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 2507\"");
		URL u = new URL("http://0.0.0.0:2507/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName", "2cb5e05d0903");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "7.0");
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		while(2>1)
		{
			AndroidDriver driver = new AndroidDriver(u,dc);
			break;
		}
	}
	
}
