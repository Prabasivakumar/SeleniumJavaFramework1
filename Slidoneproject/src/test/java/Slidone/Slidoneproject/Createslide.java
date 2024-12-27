package Slidone.Slidoneproject;
	import java.awt.Toolkit;
	import java.awt.datatransfer.DataFlavor;
	import java.awt.datatransfer.UnsupportedFlavorException;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.google.common.io.Files;

	import java.awt.HeadlessException;
	import java.awt.Toolkit;
	import java.awt.datatransfer.DataFlavor;
	import java.awt.datatransfer.UnsupportedFlavorException;
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Set;
	import java.util.concurrent.TimeoutException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.google.common.io.Files;

	import java.awt.HeadlessException;
	import java.awt.Toolkit;
	import java.awt.datatransfer.DataFlavor;
	import java.awt.datatransfer.UnsupportedFlavorException;
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Set;

	public class Createslide {

	    private static final String WebElement = null;
		private WebDriver driver;
	    private WebDriverWait wait;
	    

	    @BeforeClass
	    public void setup() {
	        // Setup the ChromeDriver
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }

	    @Test(priority = 1)
	    public void testNavigateToChrome() throws InterruptedException {
	        // Navigate to the application
	        driver.get("https://sitpres.slidone.com/auth/signin");
	        driver.findElement(By.xpath("//*[@id='emailInput']")).sendKeys("tanatok637@ronete.com");
	        driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys("praba@1107S");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(5000);
	    }

	    @Test(priority = 2)
	    public void testCreatePresentation() throws InterruptedException {
	    	Thread.sleep(8000);
	        
	    	for(int a = 1; a <=10; a++) {
	    	driver.findElement(By.xpath("//button[contains(@class,'btn btn-n')]")).click();
	    	Thread.sleep(4000);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='slideName']"))).sendKeys("Testing");
	        Thread.sleep(1000);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Save']"))).click();
	        Thread.sleep(2000);
	        //driver.findElement(By.xpath("/html/body/app-root/app-work-space/section/app-nav-bar/header/div/div/div[1]/a/img")).click();
	        driver.findElement(By.xpath("//div[contains(@class,'gap-3 d-flex')]//a[1]")).click();
	        System.out.println(a);
	    	}
	          
	    }
	    
}
