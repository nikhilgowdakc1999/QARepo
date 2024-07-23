package com.sgtesting.actitime;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot2 {
	static WebDriver oBrowser=null;
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		/*String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");*/
    	ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		 oBrowser=new ChromeDriver(options);
		 oBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 oBrowser.get("https://www.javatpoint.com/exception-handling-in-java");
         oBrowser.manage().window().maximize();
         
         //Fullpage screenshot
         JavascriptExecutor js=(JavascriptExecutor)oBrowser;
         WebElement oEle=oBrowser.findElement(By.xpath("//h2[text()='What is Exception in Java? ']"));
         js.executeScript("arguments[0].style.border='solid red';", oEle);
         TakesScreenshot ts=(TakesScreenshot)oBrowser;
         File src=ts.getScreenshotAs(OutputType.FILE);
         File trg=new File("D:\\New folder\\EXAMPLE\\homepge.png");
         FileUtils.copyFile(src, trg);
         
         //screenshot of section/portion of the page
         WebElement oEle1=oBrowser.findElement(By.xpath("//h2[text()='What is Exception in Java? ']"));
         File src1=oEle1.getScreenshotAs(OutputType.FILE);
         File trg1=new File("D:\\New folder\\EXAMPLE\\homepge-sc.png");
         FileUtils.copyFile(src1, trg1);
         
         oBrowser.close();
         
	}

}
