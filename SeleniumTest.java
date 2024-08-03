package Test;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumTest {

	public static void main (String args[]) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.navigate().to("https://www.fitpeo.com/");
		 
		 driver.manage().window().maximize();
		 
		 //Navigation to calculator page
		 driver.navigate().to("https://fitpeo.com/revenue-calculator");
	 
		 Thread.sleep(1000);
		 //scrolling window
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 
		 //Scrolling slider
		 WebDriverWait wait = new WebDriverWait(driver, 100);
		 WebElement element = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]")));
			Actions actions=new Actions(driver);
			actions.clickAndHold(element).moveByOffset(93, 5).release().perform();	
		
		
		Thread.sleep(1000);
		//Sending value in textbox
		 WebElement inputField = driver.findElement(By.xpath("//*[@id=\":R57alklff9da:\"]"));

		            // Create an instance of JavascriptExecutor
		            JavascriptExecutor js6 = (JavascriptExecutor) driver;

		            // JavaScript code to set value of the input field
		            String script = "arguments[0].value = '620';";
		            
		            // Execute the JavaScript code
		            js.executeScript(script, inputField);

		
		
		
		 WebElement checkbox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/label/span[2]"));
		 JavascriptExecutor js11 = (JavascriptExecutor) driver;
		 js11.executeScript("arguments[0].click();", checkbox);
		 
		 //cb1
		 WebElement checkbox1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/label/span[2]"));
		 JavascriptExecutor js12 = (JavascriptExecutor) driver;
		 js12.executeScript("arguments[0].click();", checkbox1);
		 
		 //cb2
		 WebElement checkbox2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/label/span[2]"));
		 JavascriptExecutor js13 = (JavascriptExecutor) driver;
		 js13.executeScript("arguments[0].click();", checkbox2);
		 
		 //cb3
		 
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("window.scrollBy(0,350)", "");
		 js2.executeScript("window.scrollBy(0,350)", "");
		 WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[8]/label/span[2]"));
		 JavascriptExecutor js14 = (JavascriptExecutor) driver;
		 js14.executeScript("arguments[0].click();", checkbox3);
		 
		 ///html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/p[2]/text()[2]
		 
		// WebElement ele = driver.findElement(By.xpath("///html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/p[2]/text()[2]]"));
		 
		 JavascriptExecutor js3 = (JavascriptExecutor) driver;
		 js3.executeScript("window.scrollBy(0,-350)", "");
		 js3.executeScript("window.scrollBy(0,-350)", "");
		 js3.executeScript("window.scrollBy(0,-550)", "");
		 WebElement ele = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/p[2]")));
		 Thread.sleep(100);	
		 System.out.println(ele.getText());
		 
		
}
	
	}
	

