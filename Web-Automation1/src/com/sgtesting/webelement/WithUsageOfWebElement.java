package com.sgtesting.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithUsageOfWebElement {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		withWebElement();
	}
	
	
		private static void launchBrowser()
		{
			try
			{
				String path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void withWebElement()
		{
			try
			{
				WebElement oEle=oBrowser.findElement(By.id("username"));
				oEle.sendKeys("demoUser1");
				Thread.sleep(1000);
				oEle.clear();
				Thread.sleep(1000);
				oEle.sendKeys("demoUser2");
				Thread.sleep(1000);
				oEle.clear();
				Thread.sleep(1000);
				oEle.sendKeys("demoUser3");
				Thread.sleep(1000);
				oEle.clear();
				Thread.sleep(1000);
				oEle.sendKeys("demoUser12345");
				Thread.sleep(1000);
				String content=oEle.getAttribute("value");
				System.out.println(content);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}


