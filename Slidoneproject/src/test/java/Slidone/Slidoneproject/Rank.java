package Slidone.Slidoneproject;


import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
 
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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
import com.google.common.io.Files;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Rank {
       
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
		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Presentation']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='slideName']"))).sendKeys("Testing");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Save']"))).click();
	}
	//Ranking
			@Test(priority = 3)
			public void rankingTest() throws InterruptedException {
				Thread.sleep(5000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[1]"))).click();
/*				// Click design and upload image
				Thread.sleep(7000);
			     driver.findElement(By.xpath("//p[text()='Design']")).click();
			     // Visualization type for multiple choice
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Donut']"))).click();
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Pie']"))).click();
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Bar']"))).click();
				    
			     // Show percentage for multiple choice
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='slider round'])[2]"))).click();
			     
			     // Apply layout
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='layout-type-card text-center'])[3]"))).click();  //Image left
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='layout-type-card text-center'])[4]"))).click();  //Image right
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='layout-type-card text-center'])[5]"))).click();  //Side by side left
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='layout-type-card text-center'])[6]"))).click();  //Side by side right 
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='layout-type-card text-center'])[2]"))).click();  //Full image
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='layout-type-card text-center'])[1]"))).click();  //Default image
			       
			     // Visualization type for open ended
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Speech bubbles']"))).click();
			     Thread.sleep(5000);
			     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Flowing grid']"))).click();
*/
           /*     //Settings for multiple choice
				 Thread.sleep(3000);
			     driver.findElement(By.xpath("//p[text()='Settings']")).click();
			     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='slider round hover-border'])[1]"))).click(); // Enable voting
			     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='slider round hover-border'])[2]"))).click(); // Select multiple options
			     WebElement Selection_per_par = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='number']")));  // Selections per participants
			     Selection_per_par.clear();
			     Selection_per_par.sendKeys("2");
			     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='slider round hover-border'])[3]"))).click(); // Show in results
*/
			 /*    // Settings for all other slide types
			     Thread.sleep(3000);
			     driver.findElement(By.xpath("//p[text()='Settings']")).click();
			     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='slider round hover-border'])[1]"))).click(); // Enable voting
			     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='slider round hover-border'])[2]"))).click(); // Show in results
			     */
				 // Presenter controls
				Thread.sleep(5000);
	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Present\"]"))).click();
			     Thread.sleep(7000);
			     //WebElement hover = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='position-menu-bottom-second hover-target']")));
			     Actions actions = new Actions(driver);
			     actions.moveToElement( wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-presentation/section/div/div/div/div[1]/div[2]/div[2]/app-presenter-toolbar/div[3]")))).build().perform();
			     
			     WebElement comments =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@data-tooltip='Enable Comments'])[1]")));  
			     Actions actions1 = new Actions(driver);
			     actions1.moveToElement(comments).click().build().perform();
			   //div[@class='position-menu-bottom-second hover-target ng-star-inserted hover-to-show-values']

				
				
				/* wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Ranking']"))).sendKeys("Rank the orders");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Rank it in alphabetical order");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Item ']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[normalize-space()='Add Item'])[1]"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 1']"))).sendKeys("Apple");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 2']"))).sendKeys("Mango");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 3']"))).sendKeys("Pineapple");
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 4']"))).sendKeys("Watermelon");
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 5']"))).sendKeys("Banana");
				 Thread.sleep(3000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement element = driver.findElement(By.xpath("//input[@placeholder='Item 4']"));
 
				// Scroll to the element
				js.executeScript("arguments[0].scrollIntoView(true);", element);
 
				// Check if the element is present and send keys
				if (element.isDisplayed()) {
				    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 4']"))).sendKeys("Watermelon");
				}
 
				// Continue with the rest
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 5']"))).sendKeys("Banana");
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 4']"))).sendKeys("Watermelon");
				
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 5']"))).sendKeys("Banana");
				 //copy code and present
	            //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg[name='copy']"))).click();
	            //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Present\"]"))).click();
			}
			//Open in new tab and paste the link
			@Test(priority = 4)
			public void submitresponse() throws InterruptedException, UnsupportedFlavorException, IOException{
				wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    	 //driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		    	 driver.findElement(By.className("icon-svg")).click();
		    	 driver.findElement(By.xpath("//button[./img[contains(@src, 'play_arrow.svg')]]")).click();
		    	
		    	
		         Thread.sleep(3000);
		        // File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		         //Files.copy(screenshotFile1, new File("C:\\Users\\DHT-IT-018\\Downloads\\slideone\\qa_P.png"));//P=presentation
		         
		         // Get the copied link from the clipboard
		         String presentationLink = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
 
		         String currentWindowHandle = driver.getWindowHandle();
 
		         // Open a new tab and navigate to the presentation link
		         JavascriptExecutor js = (JavascriptExecutor) driver;
		         js.executeScript("window.open();");
 
		         Set<String> windowHandles = driver.getWindowHandles();
		         String[] handles = windowHandles.toArray(new String[0]);
		         driver.switchTo().window(handles[handles.length - 1]); // Switch to the new tab
		         driver.get(presentationLink);
	        	
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
	        	
     	     //   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", element);
	        	 Thread.sleep(3000);
	        	 JavascriptExecutor js2 = (JavascriptExecutor) driver;

	        	// Scroll to the bottom of the page
	        	js2.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	        	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Submit']")));
	        	    element.click();
//	        	 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);", element);
//	        */ 	
			}
 
}