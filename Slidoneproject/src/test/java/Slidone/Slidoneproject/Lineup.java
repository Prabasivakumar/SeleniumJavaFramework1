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

public class Lineup {

	WebDriver driver;
	private WebDriverWait wait;
	@BeforeClass
    public void setup() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
 
    }
	@Test(priority = 1)
    public void loginTest() throws InterruptedException {
       
        driver.get("https://app.slidone.com/auth/signin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailInput"))).sendKeys("prabashalini75@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordInput"))).sendKeys("praba@1107S");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit']"))).click();
    }
	@Test(priority = 2)
	public void createPresentationTest() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Presentation']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='slideName']"))).sendKeys("Testing");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Save']"))).click();
	}
//	//Quiz-Guess the number
//			@Test(priority = 3)
//			public void quiz_GTNTest() throws InterruptedException {
//			    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
//			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-work-space/section/main/app-left-side-bar/section/div[2]/div/div/div/ul/div[6]/div[3]/a/div/img[1]"))).click();
//			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Guess the Number']"))).sendKeys("Choose your fav num");
//			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
//			    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Expecting your reply");
//			}
	//Quiz-Lineup
			@Test(priority = 3)
			public void lineupTest() throws InterruptedException {
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//a[@class='slide-list-hover'])[15]")).click();
	       	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Lineup']"))).sendKeys("Rank the orders");
	       	    driver.navigate().refresh();
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Must respond");
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 1']"))).sendKeys("Cat");
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 2']"))).sendKeys("Dog");
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 3']"))).sendKeys("Birds");
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Order ']"))).click();
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Order ']"))).click();
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 4']"))).click();
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 4']"))).sendKeys("Fish");
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 5']"))).sendKeys("Rat");
	         //move to first slide
	            WebElement slideElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='1']")));
	            slideElement.click();
	         //copy code and present 
	            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg[name='copy']"))).click();
	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Present\"]"))).click();
			}
//			//Open in new tab and paste the link
			@Test(priority = 4)
			public void submitresponse() throws InterruptedException, UnsupportedFlavorException, IOException{
				String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.open();");
		        
		        Set<String> windowHandles = driver.getWindowHandles();
		        String[] handles = windowHandles.toArray(new String[0]);
	            driver.switchTo().window(handles[handles.length - 1]);
	            driver.get(myText);
	            Actions actions1 = new Actions(driver);
	        	actions1.sendKeys(Keys.ENTER).perform();
		         String presentationLink = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		         String currentWindowHandle = driver.getWindowHandle();
		            String originalTab = driver.getWindowHandle();
		            Set<String> allWindowHandles = driver.getWindowHandles();
		            ArrayList<String> tabs = new ArrayList<>(allWindowHandles);
		         driver.switchTo().window(handles[handles.length - 1]); // Switch to the new tab
		         driver.get(presentationLink);
		         wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).click();
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).sendKeys("prabha");
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0'])[1]"))).click();
	                driver.switchTo().window(tabs.get(0));
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()=\"Let's go\"])[1]"))).click();
	                driver.switchTo().window(tabs.get(1));
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	 Thread.sleep(3000);
	        	 JavascriptExecutor js2 = (JavascriptExecutor) driver;

	        	// Scroll to the bottom of the page
	        	js2.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	
	        	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Submit']")));
	        	    element.click();
			
//			  //submit response quiz - GTN
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).click();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).sendKeys("prabha");
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0'])[1]"))).click();
//            driver.switchTo().window(tabs.get(0));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()=\"Let's go\"])[1]"))).click();
//            driver.switchTo().window(tabs.get(1));
//            WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("guessthenumberRangeBar")));
//	         if (slider.isDisplayed() && slider.isEnabled()) {
//	             JavascriptExecutor js11 = (JavascriptExecutor) driver;
//	             js11.executeScript("arguments[0].value = '7';", slider);  
//	             js11.executeScript("arguments[0].dispatchEvent(new Event('input'));", slider);
//	         } else {
//	             System.out.println("Slider is not visible or interactable.");
//	         }
//	         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0']"))).click();
//	         driver.switchTo().window(tabs.get(0));
//	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
//	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
//	            driver.switchTo().window(tabs.get(1));
	            //Submit response for lineup
	        	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).click();
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).sendKeys("prabha");
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0'])[1]"))).click();
	             driver.switchTo().window(tabs.get(0));
	             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()=\"Let's go\"])[1]"))).click();
	             driver.switchTo().window(tabs.get(1));
				            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
				        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
				        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
				        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
				        	 Thread.sleep(3000);
				        	 JavascriptExecutor js5 = (JavascriptExecutor) driver;

				        	// Scroll to the bottom of the page
				        	js5.executeScript("window.scrollTo(0, document.body.scrollHeight);");
				        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
				        	
				        	 WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Submit']")));
				        	    element3.click();
			}
}
