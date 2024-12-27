package Slidone.Slidoneproject;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class slidonesign {
       
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailInput"))).sendKeys("121124@mailinator.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordInput"))).sendKeys("praba@1107S");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit']"))).click();
    }
	@Test(priority = 2)
	public void createPresentationTest() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Presentation']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='slideName']"))).sendKeys("Testing");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Save']"))).click();
	}
	//Ranking
			@Test(priority = 3)
			public void rankingTest() throws InterruptedException {
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[5]"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Ranking']"))).sendKeys("Rank the orders");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Rank it in alphabetical order");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Item ']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Item ']"))).click();
				driver.navigate().refresh();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 1']"))).sendKeys("Apple");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 2']"))).sendKeys("Mango");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 3']"))).sendKeys("Pineapple");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 4']"))).sendKeys("Watermelon");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 5']"))).sendKeys("Banana");
				 //copy code and present 
	            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg[name='copy']"))).click();
	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Present\"]"))).click();
			}
			//Open in new tab and paste the link
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
//	        	WebElement order1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[1]/a/div")));
//	        	 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);", order1);
//	           	 order1.click();
//	        	WebElement order2 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[2]/a/div")));
//	        	 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);", order2);
//	           	 order2.click();
//	           	Thread.sleep(2000);
//	           	WebElement order3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[3]/a/div")));
//	           	 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);", order3);
//	           	 order3.click();
//	           	Thread.sleep(2000);
//	        	WebElement order4 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[4]/a/div")));
//	        	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);", order4);
//	           	 order4.click();
//	           	Thread.sleep(2000);
//	        	WebElement order5 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[5]/a/div")));
//	        	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);", order5);
//	           	 order5.click();
//	           	Thread.sleep(2000);
//	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit']")));
//	            element.click();
//	            	
//	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[1]"))).click();
//	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[2]"))).click();
//	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div/a/div"))).click();
//	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[4]"))).click();
//	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[5]"))).click();
////	    
	        	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	        	// Define the XPath for the elements you want to interact with
	        	String xpath = "//span[contains(@class, 'range-label')]"; // Update with your actual XPath

	        	// Define the indexes of the elements you want to click (1-based index)
	        	int[] indexes = {1, 2, 3, 4, 5}; // Adjust these as needed based on your page

	        	// Loop through each index to click the corresponding element
	        	for (int index : indexes) {
	        	    try {
	        	        // Find the element using the defined XPath
	        	        WebElement element = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(" + xpath + ")[" + index + "]")));

	        	        // Debug: Log element's display status and location
	        	        System.out.println("Element with index " + index + " found. Displayed: " + element.isDisplayed() + ", Location: " + element.getLocation());

	        	        // Scroll to the element using JavaScript Executor to ensure it's in view
	        	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", element);

	        	        // Ensure the element is visible and clickable
	        	        WebElement clickableElement = wait1.until(ExpectedConditions.elementToBeClickable(element));

	        	        // Double-check if the element is still displayed after scrolling
	        	        if (!clickableElement.isDisplayed()) {
	        	            System.out.println("Element with index " + index + " is not displayed after scrolling.");
	        	            continue;  // Skip to the next element
	        	        }

	        	        // Click the element
	        	        clickableElement.click();
	        	        System.out.println("Element with index " + index + " clicked successfully!");

	        	        // Pause for a short time to observe the action (or for the page to react)
	        	        Thread.sleep(1000);
	        	    
	        	    } catch (Exception e) {
	        	        System.out.println("Failed to click element with index " + index + ": " + e.getMessage());
	        	        e.printStackTrace();  // Print full stack trace for better debugging
	        	    }
	        	}
	        	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit']")));
	        	    element.click();

	}

}


	
	
	
	
	
	
	


